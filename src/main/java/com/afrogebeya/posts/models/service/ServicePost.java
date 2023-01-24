package com.afrogebeya.posts.models.service;

import com.afrogebeya.posts.commons.models.services.ServiceSubCategory;
import com.afrogebeya.posts.models.AbstractPost;
import lombok.Data;

@Data
public class ServicePost extends AbstractPost {
    ServiceSubCategory subCategory;
}
