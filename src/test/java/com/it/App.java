package com.it;

import com.it.Helpers.CommonHelper;
import com.it.Helpers.DashboardHelper;
import com.it.Helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;

    public App() {
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.common = new CommonHelper();
    }
}
