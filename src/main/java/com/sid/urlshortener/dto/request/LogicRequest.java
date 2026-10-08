package com.sid.urlshortener.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogicRequest {
    @NotBlank(message = "Email cannot be Blank")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Password cannot be Blank")
    private String password;
}
