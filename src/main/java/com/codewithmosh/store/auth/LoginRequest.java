package com.codewithmosh.store.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Email must be provided.")
    @Email(message = "It doesn't look like email...")
    private String email;

    @NotBlank(message = "Password must be provided.")
    private String password;
}
