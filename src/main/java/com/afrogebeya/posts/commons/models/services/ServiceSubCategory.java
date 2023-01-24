package com.afrogebeya.posts.commons.models.services;

import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

@Data
public class ServiceSubCategory {
    Long id;
    String name;
    Status status;
    ServiceCategory serviceCategory;
}
