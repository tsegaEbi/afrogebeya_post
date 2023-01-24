package com.afrogebeya.posts.commons.models.product;

import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

@Data
public class ProductBrand {
    int id;
    String name;
    ProductSubCategory subCategoryList;
    Status status;
}
