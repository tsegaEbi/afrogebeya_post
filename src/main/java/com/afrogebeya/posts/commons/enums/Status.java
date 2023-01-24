package com.afrogebeya.posts.commons.enums;

public enum Status {
    ACTIVE(1,"active"),
    DEACTIVATED(2,"deactivated"),
    BLOCKED(3,"blocked"),
    DELETED(4,"deleted");
    int id;
    String name;
    Status(int id, String name){
        this.id=id;
        this.name=name;
    }
}
