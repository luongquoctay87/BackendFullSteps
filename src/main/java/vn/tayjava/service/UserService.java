package vn.tayjava.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import vn.tayjava.controller.request.ChangePwdRequest;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.model.User;

import java.util.List;

public interface UserService {

    int addUser(UserCreationRequest request);

    void updateUser(UserUpdateRequest request);

    void changePassword(ChangePwdRequest request);

    void deleteUser(int userId);

    List<UserResponse> getAllUsers();

    User getUserById(int userId);

    UserDetailsService userDetailsService();
}
