package vn.tayjava.controller.request;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class ChangePwdRequest implements Serializable {
    private int id;
    private String oldPassword;
    private String newPassword;
}
