package com.kitezone.usercreate.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequestModel {

    @NotNull(message = "1st name cannot be null")
    @Size(min = 2, message = "1st name must not be less than 2 characters")
    private String firstName;
    @NotNull(message = "2nd name cannot be null")
    @Size(min = 2, message = "1st name must not be less than 2 characters")
    private String lastName;
    @NotNull(message = "pass cannot be null")
    @Size(min = 8, max = 16, message = "The password should not be more 16 and less than 8 characters")
    private String password;
    @NotNull(message = "mail cannot be null")
    @Email
    private String email;

}
