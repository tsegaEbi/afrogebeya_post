package com.afrogebeya.posts.models;

import com.afrogebeya.posts.commons.enums.PostStatus;
import com.afrogebeya.posts.commons.enums.Status;
import com.afrogebeya.posts.models.reviews.PostComment;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public abstract class AbstractPost {

    Long Id;
    Long profileId;
    Long userId;

    Long viewCount;
    int rate;

    PostStatus postStatus;

    String username;

    Date postedDate;
    Date lastModifiedDate;

    Long updatedBy;
    Status status;
    Status commentStatus;
    Status reviewStatus;
    List<PostComment> postComments;





}
