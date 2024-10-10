package vn.tayjava.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.model.User;

import java.util.List;

public interface UserService {

    long addUser(UserCreationRequest request);

    long updateUser(UserUpdateRequest request);

    long deleteUser(int userId);

    List<UserResponse> getAllUsers(String firstName, String lastName, String email);

    User getUserById(int userId);

    UserDetailsService userDetailsService();
}
