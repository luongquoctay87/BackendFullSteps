package vn.tayjava.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.BadRequestException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.tayjava.controller.request.ChangePwdRequest;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.exception.InvalidDataException;
import vn.tayjava.exception.ResourceNotFoundException;
import vn.tayjava.model.User;
import vn.tayjava.repository.UserRepository;
import vn.tayjava.service.UserService;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        log.info("userDetailsService");
        return userRepository::findByUsername;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        log.info("getAllUsers");
        return userRepository.findAll().stream().map(user ->
                UserResponse.builder()
                        .id(user.getId())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .dateOfBirth(user.getDateOfBirth())
                        .gender(user.getGender())
                        .phone(user.getPhone())
                        .email(user.getEmail())
                        .username(user.getUsername())
                        .country(user.getCountry())
                        .language(user.getLanguage())
                        .build()
        ).toList();
    }

    @Override
    public User getUserById(int userId) {
        log.info("getUserById: {}", userId);
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
    }

    @Override
    public int addUser(UserCreationRequest request) {
        log.info("addUser: {}", request);

        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new InvalidDataException("Passwords do not match");
        }

        if (userRepository.count() > 0) {
            throw new InvalidDataException("User already exists");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());
        user.setGender(request.getGender());
        user.setPhone(request.getPhone());
        user.setEmail(request.getEmail());
        user.setUsername(request.getUsername());
        user.setPassword(UserService.passwordEncoder().encode(request.getPassword()));
        user.setCountry(request.getCountry());
        user.setLanguage(request.getLanguage());

        userRepository.save(user);

        return user.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUser(UserUpdateRequest request) {
        log.info("updateUser: {}", request);

        if (userRepository.count() > 0) {
            throw new InvalidDataException("User already exists");
        }

        User user = getUserById(request.getId());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());
        user.setGender(request.getGender());
        user.setPhone(request.getPhone());
        user.setUsername(request.getUsername());
        user.setCountry(request.getCountry());
        user.setLanguage(request.getLanguage());

        userRepository.save(user);
    }

    @Override
    public void changePassword(ChangePwdRequest request) {
        log.info("changePassword: {}", request);

        User user = getUserById(request.getId());
        if (!UserService.passwordEncoder().matches(request.getOldPassword(), user.getPassword())){
            throw new InvalidDataException("Old Password do not match");
        }
        user.setPassword(UserService.passwordEncoder().encode(request.getNewPassword()));
        userRepository.save(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUser(int userId) {
        log.info("deleteUser: {}", userId);
        userRepository.deleteById(userId);
    }
}
