package com.it.Tests;

import com.it.App;
import com.it.Utils.Factory;
import com.it.Utils.Users.User;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = Factory.Users.getValidUser();

    @AfterSuite
    public void tearDown() {
        app.common.closeApp();
    }
}
