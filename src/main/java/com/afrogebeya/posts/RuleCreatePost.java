package com.afrogebeya.posts;

import com.afrogebeya.posts.commons.security.User;
import com.afrogebeya.posts.models.AbstractPost;
import org.springframework.stereotype.Service;


@Service
public class RuleCreatePost {

    public static boolean CheckValidity( AbstractPost   post,  User user){

        return true;
    }
}
