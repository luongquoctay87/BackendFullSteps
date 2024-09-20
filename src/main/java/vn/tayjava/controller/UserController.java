package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller")
public class UserController {
    @GetMapping("/list")
    public String getAllUsers() {
        return "listUser";
    }
}
