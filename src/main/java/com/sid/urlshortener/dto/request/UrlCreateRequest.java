package com.sid.urlshortener.dto.request;

import com.sid.urlshortener.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@Setter
public class UrlCreateRequest {

    @NotBlank(message = "originalUrl cannot be blank")
    private String originalUrl;

    @NotBlank(message = "shortCode cannot be blank")
    private String shortCode;

    private String customUrl;

    private String passwordHash;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

}

