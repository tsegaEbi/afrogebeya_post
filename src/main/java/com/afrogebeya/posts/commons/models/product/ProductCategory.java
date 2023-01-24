package com.afrogebeya.posts.commons.models.product;

import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

@Data
public class ProductCategory {
    int id;
    String name;
    Status status;

}
