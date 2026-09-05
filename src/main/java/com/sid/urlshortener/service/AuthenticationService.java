package com.sid.urlshortener.service;

import com.sid.urlshortener.payload.request.AuthenticationRequest;
import org.apache.tomcat.util.http.parser.Authorization;

public interface AuthenticationService {
    Authorization Register(AuthenticationRequest request);
    AuthenticationRequest Authentication(AuthenticationRequest request);

}
