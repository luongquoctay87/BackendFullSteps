package vn.tayjava.service;


import vn.tayjava.controller.request.LogInRequest;
import vn.tayjava.controller.response.TokenResponse;

public interface AuthenticationService {

    TokenResponse createAccessToken(LogInRequest request);

    TokenResponse refreshAccessToken(String request);
}

