package vn.tayjava.controller.request;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class LogInRequest implements Serializable {

    private String username;
    private String password;
    private String platform; // web, mobile, tablet
    private String deviceToken; // de push notify
    private String versionApp;
}
