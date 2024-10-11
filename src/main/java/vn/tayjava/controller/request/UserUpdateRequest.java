package vn.tayjava.controller.request;

import lombok.Getter;
import vn.tayjava.model.Gender;

import java.io.Serializable;

@Getter
public class UserUpdateRequest implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Gender gender;
    private String phone;
    private String username;
    private String country;
    private String language;
}
