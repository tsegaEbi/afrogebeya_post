package com.afrogebeya.posts.commons.security;

import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

import java.util.List;

@Data
public class User {
    Long id;
    String email;
    Status status;
    List<String> roles;
}
