package com.afrogebeya.posts.models.reviews;

import com.afrogebeya.posts.commons.enums.PostGroup;
import com.afrogebeya.posts.commons.enums.Status;
import lombok.Data;

import java.sql.Date;

@Data
public class PostComment {
    Long id;
    Long userId;
    Long profileId;
    String comment;
    PostGroup postGroup;

    Date dateCommented;
    Date lastUpdated;
    Long version;
    Long updatedBy;
    Status status;
}
