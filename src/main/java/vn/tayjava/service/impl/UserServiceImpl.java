package vn.tayjava.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.exception.ResourceNotFoundException;
import vn.tayjava.model.User;
import vn.tayjava.repository.UserRepository;
import vn.tayjava.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public long addUser(UserCreationRequest request) {
        return 0;
    }

    @Override
    public long updateUser(UserUpdateRequest request) {
        return 0;
    }

    @Override
    public long deleteUser(int userId) {
        return 0;
    }

    @Override
    public List<UserResponse> getAllUsers(String firstName, String lastName, String email) {
        return List.of();
    }

    @Override
    public User getUserById(int userId) {
       return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Not Found"));
    }

    @Override
    public UserDetailsService userDetailsService() {
        return userRepository::findByUsername;
    }
}
