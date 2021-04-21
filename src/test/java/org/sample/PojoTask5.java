package org.sample;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoTask5 extends utility {
	public PojoTask5() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
	@FindBy(id="order_no"),
	@FindBy(name="order_no")
	})
	private WebElement odNo;
	public WebElement getOdNo() {
		return odNo;
	}
	

}



