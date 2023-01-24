package com.afrogebeya.posts.models.product;

import com.afrogebeya.posts.commons.models.product.ProductSubCategory;
import com.afrogebeya.posts.models.AbstractPost;
import lombok.Data;

@Data
public class ProductPost extends AbstractPost {
     ProductSubCategory subCategory;
}
