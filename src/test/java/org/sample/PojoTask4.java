package org.sample;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoTask4 extends utility{
	public PojoTask4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="first_name")
	private WebElement fName;
	@FindBy(name="last_name")
	private WebElement lName;
	@FindBy(name="address")
	private WebElement adds;
	@FindBy(name="cc_num")
	private WebElement cardNo;
	@FindBy(name="cc_exp_month")
	private WebElement exMonth;
	@FindBy(name="cc_exp_year")
	private WebElement exYear;
	@FindBy(name="cc_cvv")
	private WebElement threeNo;
	@FindBy(name="book_now")
    private WebElement toBook;
	@FindBy(name="cc_type")
	private WebElement cardType;
	
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAdds() {
		return adds;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getExMonth() {
		return exMonth;
	}
	public WebElement getExYear() {
		return exYear;
	}
	public WebElement getThreeNo() {
		return threeNo;
	}
	public WebElement getToBook() {
		return toBook;
	}

}
