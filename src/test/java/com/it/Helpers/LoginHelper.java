package com.it.Helpers;

import com.it.Pages.LoginPage;
import com.it.Utils.Users.User;

public class LoginHelper extends LoginPage {

    public void login(User user) {
        login(user.getLogin(), user.getPassword());
    }
}
