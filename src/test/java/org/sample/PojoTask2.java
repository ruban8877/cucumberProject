package org.sample;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoTask2 extends utility{
	public WebElement getLc() {
		return lc;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement gettRoom() {
		return tRoom;
	}
	public WebElement getNoRooms() {
		return noRooms;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getApRoom() {
		return apRoom;
	}
	public WebElement getCpRoom() {
		return cpRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	public PojoTask2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement lc;
	@FindBy(name="hotels")
	private WebElement hotelName;
	@FindBy(name="room_type")
	private WebElement tRoom;
	@FindBy(name="room_nos")
	private WebElement noRooms;
	@FindBy(name="datepick_in")
	private WebElement inDate;
	@FindBy(name="datepick_out")
	private WebElement outDate;
	@FindBy(name="adult_room")
	private WebElement apRoom;
	@FindBy(name="child_room")
	private WebElement cpRoom;
	@FindBy(name="Submit")
	private WebElement search;

}
