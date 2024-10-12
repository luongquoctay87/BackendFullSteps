package vn.tayjava.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import vn.tayjava.controller.request.ChangePwdRequest;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.model.User;

import java.util.List;

public interface UserService {

    static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    };

    UserDetailsService userDetailsService();

    List<UserResponse> getAllUsers();

    User getUserById(int userId);

    int addUser(UserCreationRequest request);

    void updateUser(UserUpdateRequest request);

    void changePassword(ChangePwdRequest request);

    void deleteUser(int userId);

}
