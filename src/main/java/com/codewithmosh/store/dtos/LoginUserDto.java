package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUserDto {
    @NotBlank(message = "Email must be provided.")
    @Email(message = "It doesn't look like email...")
    private String email;

    @NotBlank(message = "Password must be provided.")
    private String password;
}
