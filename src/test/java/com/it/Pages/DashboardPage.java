package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement userEmail;

    public String getUserEmail() {
        return userEmail.getText();
    }

}
