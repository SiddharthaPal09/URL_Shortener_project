package com.sid.urlshortener.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor // for hibernate to executes Sql command by creating objects
@AllArgsConstructor
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 2048)
    private String originalUrl;

    @Column(nullable = false,unique = true,length = 50)
    private String shortCode;

    private String passwordHash;

    @Column(nullable = false)
    private boolean passwordProtected;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    private int clickCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private LocalDateTime expiryDate;

    @PrePersist
    void onCreate(){
        createdAt=LocalDateTime.now();
        updateAt=LocalDateTime.now();
    }

    @PreUpdate
    void onUpdate(){
        updateAt=LocalDateTime.now();
    }


}