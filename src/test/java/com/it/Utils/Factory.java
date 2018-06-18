package com.it.Utils;

import com.it.Utils.Users.User;

import java.util.ResourceBundle;

public class Factory {
    public static class Users{
        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser(){
            return new User(resourceUser.getString("validUser.login"), resourceUser.getString("validUser.password"), resourceUser.getString("validUser.email"));
        }
        public static User getRandomUser (){
            return new User("ira", "qwerty", "test@i.ua");
        }
    }
}
