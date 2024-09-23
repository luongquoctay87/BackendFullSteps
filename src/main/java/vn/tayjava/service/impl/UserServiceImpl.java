package vn.tayjava.service.impl;

import org.springframework.stereotype.Service;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
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
    public UserResponse getUserById(int userId) {
        return null;
    }
}
