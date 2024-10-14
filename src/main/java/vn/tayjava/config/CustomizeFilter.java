package vn.tayjava.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import vn.tayjava.common.TokenType;
import vn.tayjava.controller.response.ApiErrorResponse;
import vn.tayjava.service.JwtService;
import vn.tayjava.service.UserService;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Component
@RequiredArgsConstructor
@Slf4j(topic = "CUSTOMIZE-FILTER")
public class CustomizeFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("{} {}", request.getMethod(), request.getRequestURI());
//
//        final String authHeader = request.getHeader(AUTHORIZATION);
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            String token = authHeader.substring(7);
//            log.info("token: {}...", token.substring(0, 20));
//            String username = "";
//            try {
//                username = jwtService.extractUsername(token, TokenType.ACCESS_TOKEN);
//                log.info("username: {}", username);
//            } catch (AccessDeniedException e) {
//                log.info(e.getMessage());
//                response.setStatus(HttpServletResponse.SC_OK);
//                response.getWriter().write(errorResponse(e.getMessage()));
//            }
//
//            var user = userService.userDetailsService().loadUserByUsername(username);
//
//            isAllowed(request.getRequestURI(), user.getAuthorities());
//
////            SecurityContext context = SecurityContextHolder.createEmptyContext();
////            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
////            authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
////            context.setAuthentication(authToken);
////            SecurityContextHolder.setContext(context);

            filterChain.doFilter(request, response);
//        } else {
//            filterChain.doFilter(request, response);
//        }
    }

    boolean isAllowed(String apiUrl, Collection<? extends GrantedAuthority> roles) {
        String ROLE_ADMIN = "ROLE_ADMIN";
        String ROLE_EDITOR = "ROLE_EDITOR";
        String ROLE_AUTHOR = "ROLE_AUTHOR";
        String ROLE_CONTRIBUTOR = "ROLE_CONTRIBUTOR";
        String ROLE_SUBSCRIBER = "ROLE_SUBSCRIBER";

        if (roles.contains(ROLE_ADMIN)) {
            return true;
        }

        if (roles.contains(ROLE_EDITOR)) {

        }

        if (roles.contains(ROLE_AUTHOR)) {

        }

        if (roles.contains(ROLE_CONTRIBUTOR)) {

        }

        if (roles.contains(ROLE_SUBSCRIBER)) {

        }

        return false;
    }

    /**
     * Create error response with pretty template
     * @param message
     * @return
     */
    private String errorResponse(String message) {
        try {
            ApiErrorResponse error = new ApiErrorResponse();
            error.setTimestamp(new Date());
            error.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            error.setMessage(message);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(error);
        } catch (Exception e) {
            return ""; // Return an empty string if serialization fails
        }
    }
}
