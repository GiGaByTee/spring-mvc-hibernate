package com.websystique.springmvc.model;

public enum UserProfileType {
    USER("USER"),
    LALKA("LALKA"),
    MANAGER("MANAGER"),
    ADMIN("ADMIN");

    String userProfileType;

    UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }

}