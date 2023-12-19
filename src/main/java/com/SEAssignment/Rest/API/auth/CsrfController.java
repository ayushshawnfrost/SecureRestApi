package com.SEAssignment.Rest.API.auth;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CsrfController {

    @GetMapping("/csrf/token")
    public CsrfToken csrf(CsrfToken token){
        return token;
    }
}
