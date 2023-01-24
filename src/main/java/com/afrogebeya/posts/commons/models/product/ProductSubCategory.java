package com.afrogebeya.posts.commons.models.product;

import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

@Data
public class ProductSubCategory {
    int id;
    ProductCategory productCategory;
    String name;
    Status status;
}
