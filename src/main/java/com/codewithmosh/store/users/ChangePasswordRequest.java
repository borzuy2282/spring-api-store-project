package com.codewithmosh.store.users;


import lombok.Data;

@Data
public class ChangePasswordRequest {
    private String oldPassword;
    public String newPassword;
}
