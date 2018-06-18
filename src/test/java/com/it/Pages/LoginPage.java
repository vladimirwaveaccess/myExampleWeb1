package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	@FindBy(name = "login")
	private WebElement login;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
	private WebElement btnSubmit;


    public void login(String name, String pass) {

    	login.sendKeys(name);
        password.sendKeys(pass);
        btnSubmit.click();
    }
}
