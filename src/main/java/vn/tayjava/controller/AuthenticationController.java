package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.tayjava.controller.request.LogInRequest;
import vn.tayjava.controller.response.TokenResponse;
import vn.tayjava.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication Controller")
@Slf4j(topic = "AUTHENTICATION-CONTROLLER")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @Operation(summary = "Access token", description = "API nay dung de login")
    @PostMapping("/access-token")
    public TokenResponse accessToken(@RequestBody LogInRequest request) {
        log.info("accessToken = {}", request.toString());
        return authenticationService.createAccessToken(request);
    }

    @Operation(summary = "Refresh token", description = "API nay dung de lay token moi")
    @PostMapping("/refresh-token")
    public TokenResponse refreshToken(@RequestBody String refreshToken) {
        log.info("refreshToken = {}", refreshToken.toString());
        return authenticationService.refreshAccessToken(refreshToken);
    }
}
