package vn.tayjava.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.tayjava.controller.request.LogInRequest;
import vn.tayjava.controller.response.TokenResponse;
import vn.tayjava.model.User;
import vn.tayjava.repository.UserRepository;
import vn.tayjava.service.AuthenticationService;
import vn.tayjava.service.JwtService;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final JwtService jwtService;
    private final UserRepository userRepository;

    @Override
    public TokenResponse createAccessToken(LogInRequest request) {
        // Get user
        User user = userRepository.findByUsername(request.getUsername());
        if (user == null) {
            throw new UsernameNotFoundException(request.getUsername());
        }

        String accessToken = jwtService.generateToken(1, "admin", null);
        String refreshToken = jwtService.generateRefreshToken(1, "admin", null);

        return TokenResponse.builder().accessToken(accessToken).refreshToken(refreshToken).build();
    }

    @Override
    public TokenResponse refreshAccessToken(String request) {
        return null;
    }
}
