package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.logging.LogLevel;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vn.tayjava.config.RequestContext;
import vn.tayjava.controller.request.ChangePwdRequest;
import vn.tayjava.controller.request.UserCreationRequest;
import vn.tayjava.controller.request.UserUpdateRequest;
import vn.tayjava.controller.response.UserResponse;
import vn.tayjava.model.LogInfo;
import vn.tayjava.model.LogMessage;
import vn.tayjava.model.User;
import vn.tayjava.service.UserService;

import java.util.List;


@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name = "User Controller")
//@Slf4j(topic = "USER-CONTROLLER")
public class UserController {

    private final UserService userService;

    @GetMapping("/list")
    public List<UserResponse> getAllUsers() {
//        log.info("Get list of users")
        LogInfo logInfo = RequestContext.getCurrentRequest();
        logInfo.setStatus(200);
        logInfo.setLogMessage(LogMessage.builder().controller("Get list of users").build());
        RequestContext.setCurrentRequest(logInfo);

        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
//        log.info("Get user detail by id: {}", userId);
        return userService.getUserById(userId);
    }

    @PostMapping("/add")
    public int addUser(@Valid @RequestBody UserCreationRequest request) {
//        log.info("Add user: {}", request);
        return userService.addUser(request);
    }

    @PutMapping("/upd")
    public void updateUser(@Valid @RequestBody UserUpdateRequest request) {
//        log.info("Update user: {}", request);
        userService.updateUser(request);
    }

    @PatchMapping("/change-pwd")
    public void changePassword(@Valid @RequestBody ChangePwdRequest request) {
//        log.info("Change password for userId={}", request.getId());
        userService.changePassword(request);
    }

    @DeleteMapping("/del/{userId}")
    public void updateUser(@PathVariable int userId) {
//        log.info("Delete user: {}", userId);
        userService.deleteUser(userId);
    }
}
