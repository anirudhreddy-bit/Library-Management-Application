package com.ani.library.management.Util;

import com.ani.library.management.DataAccessLayer.User;

public class UserValidator {

    public static boolean isValidUser(User user){
        if(user.getEmail()==null || user.getEmail()=="")
            return false;
        else return true;
    }
}
