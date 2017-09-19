package com.andrey.mvptest;

import java.util.Observable;

/**
 * Created by sts on 15.09.17.
 */

public class MainPresenter {

    User user;
    View view;
    SomeText someText;

    public MainPresenter(View view)
    {
        user = new User();
        this.view = view;

        someText = new SomeText();
    }

    public void updateFullName(String fullName)
    {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.getData());
    }

    public void updateEmail(String email)
    {
        user.setEmail(email);
        view.updateUserInfoTextView(user.getData());///!!!!!
    }

    public void updateSomeText(String str)
    {
        someText.setString(str);
        view.updateString(someText.getString().length());
    }

    public interface View
    {
        void updateUserInfoTextView(String info);
        void updateString(int count);
    }
}
