package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.tayjava.controller.response.ApiResponse;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller")
public class UserController {

    @GetMapping("/list")
    public ResponseEntity<String> getAllUsers(@RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "0") int size,
                                              @RequestParam(required = false) String sort,
                                              @RequestParam(required = false) String... search) {
        return ResponseEntity.ok(ApiResponse.success(200, "users", List.of("A", "B", "C", "D", "E", "F", "G")));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable String userId) {
        return ResponseEntity.ok(ApiResponse.success(200, "user", List.of("A")));
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser() {
        return ResponseEntity.ok(ApiResponse.success(201, "created"));
    }

    @PutMapping("/upd")
    public ResponseEntity<String> updateUser() {
        return ResponseEntity.ok(ApiResponse.success(202, "updated"));
    }

    @PatchMapping("/change-pwd")
    public ResponseEntity<String> changePassword() {
        return ResponseEntity.ok(ApiResponse.success(202, "changed"));
    }

    @DeleteMapping("/del")
    public ResponseEntity<String> deleteUser() {
        return ResponseEntity.ok(ApiResponse.success(203, "deleted"));
    }
}
