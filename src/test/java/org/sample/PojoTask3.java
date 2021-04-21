package org.sample;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoTask3 extends utility {
	public PojoTask3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement toClickbtn;
	@FindBy(name="continue")
	private WebElement toConBtn;
	public WebElement getToClickbtn() {
		return toClickbtn;
	}
	public WebElement getToConBtn() {
		return toConBtn;
	}
	


}
