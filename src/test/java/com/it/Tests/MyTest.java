package com.it.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void testWeb() {


        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getUserEmail().split("@")[0], validUser.getLogin());

    }
}
