package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.model.User;
import vn.tayjava.service.UserService;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller")
@RequiredArgsConstructor
@Slf4j
@Validated
public class UserController {

    private final UserService userService;

    @GetMapping("/list")
    public String getAllUsers() {
        return "listUser";
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/")
    public int addUser(@Valid @RequestBody UserCreationRequest userCreationRequest) {
        return 1;
    }
}
