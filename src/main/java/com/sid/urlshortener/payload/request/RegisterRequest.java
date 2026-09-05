package com.sid.urlshortener.payload.request;

import com.sid.urlshortener.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "firstname is Required")
    private String firstname;

    @NotBlank(message = "firstname is Required")
    private String lastname;

    @NotBlank(message = "firstname is Required")
    @Email(message = "Email format is not Valid")
    private String email;


    @NotBlank(message = "Password is Required")
    private String password;
    private Role role;

}