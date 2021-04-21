package org.sample;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoTask1 extends utility {
	public PojoTask1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="login")
	private WebElement toLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getToLogin() {
		return toLogin;
	}

}
