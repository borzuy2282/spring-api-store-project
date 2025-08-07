package com.borzixx.store.auth;


import com.borzixx.store.users.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import lombok.Data;

import javax.crypto.SecretKey;
import java.util.Date;

@Data
public class Jwt {
    private final Claims claims;
    private final SecretKey key;

    public Jwt(Claims claims, SecretKey key) {
        this.claims = claims;
        this.key = key;
    }

    public boolean isExpired(){
        try {
            return claims.getExpiration().before(new Date());
        } catch (JwtException e){
            return true;
        }
    }

    public Long getUserId(){
        return Long.valueOf(claims.getSubject());
    }


    public Role getRole(){
        return Role.valueOf(claims.get("role", String.class));
    }

    public String toString(){
        return Jwts.builder().claims(claims).signWith(key).compact();
    }
}
