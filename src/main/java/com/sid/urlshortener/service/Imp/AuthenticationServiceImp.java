package com.sid.urlshortener.service.Imp;

import com.sid.urlshortener.entity.User;
import com.sid.urlshortener.dto.request.AuthenticationRequest;
import com.sid.urlshortener.repository.UserRepository;
import com.sid.urlshortener.service.AuthenticationService;
import org.apache.catalina.connector.Request;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImp implements AuthenticationService {
    private final UserRepository userRepository;

    public AuthenticationServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Authorization Register(AuthenticationRequest request) {
        User user = new User();
        user.setFirstname(Request.firstname());


    }

    @Override
    public AuthenticationRequest Authentication(AuthenticationRequest request) {
        return null;
    }
}
