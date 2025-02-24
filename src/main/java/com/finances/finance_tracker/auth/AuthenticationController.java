package com.finances.finance_tracker.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

        @PostMapping("/register")
        public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
            return ResponseEntity.ok(authenticationService.register(request));
        }

        @PostMapping("/authenticate")
        public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request) {
            return ResponseEntity.ok(authenticationService.authenticate(request));
        }
        
}
