package vn.tayjava.service;

import org.springframework.security.core.GrantedAuthority;
import vn.tayjava.common.TokenType;

import java.util.Collection;

public interface JwtService {

    String generateToken(int userId, String username, Collection<? extends GrantedAuthority> authorities);

    String generateRefreshToken(int userId, String username, Collection<? extends GrantedAuthority> authorities);

    String extractUsername(String token, TokenType type);
}
