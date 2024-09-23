package vn.tayjava.controller.response;

import lombok.Getter;
import lombok.Setter;
import vn.tayjava.model.Gender;

import java.io.Serializable;

@Getter
@Setter
public class UserResponse implements Serializable {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Gender gender;
    private String phone;
    private String email;
    private String username;
    private String country;
    private String language;
}
