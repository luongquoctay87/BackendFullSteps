package vn.tayjava.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.ToString;
import vn.tayjava.model.Gender;

import java.io.Serializable;

@Getter
@ToString
public class UserCreationRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Gender gender;
    private String phone;
    @NotBlank(message = "email must be not blank")
    private String email;
    @NotBlank(message = "username must be not blank")
    private String username;
    @NotBlank(message = "password must be not blank")
    private String password;
    @NotBlank(message = "confirmPassword must be not blank")
    private String confirmPassword;
    private String country;
    private String language;
}
