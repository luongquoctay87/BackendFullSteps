package vn.tayjava.service;

import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;

import java.util.List;

public interface UserService {

    long addUser(UserCreationRequest request);

    long updateUser(UserUpdateRequest request);

    long deleteUser(int userId);

    List<UserResponse> getAllUsers(String firstName, String lastName, String email);

    UserResponse getUserById(int userId);
}