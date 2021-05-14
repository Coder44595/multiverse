package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

public class Hash {
    public static void main( String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("hash123");

        System.out.println(hashedPassword);
    }
}
