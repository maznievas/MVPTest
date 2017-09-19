package com.andrey.mvptest;

/**
 * Created by sts on 15.09.17.
 */

public class User {

    private String fullName;
    private String email;

    public void setFullName(String fullName){ this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public String getData()
    {
        return "FullName : " + fullName + "\nEmail : " + email;
    }
}
