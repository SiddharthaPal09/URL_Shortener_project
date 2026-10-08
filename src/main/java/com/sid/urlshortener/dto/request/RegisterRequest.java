package com.sid.urlshortener.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "firstname is Required")
    private String firstname;

    @NotBlank(message = "firstname is Required")
    @Email(message = "Email format is not Valid")
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min = 8,max=100)
    @Pattern(regexp = "(?=.*[A-za-z])(?=.*//d).*$")
    private String password;


}