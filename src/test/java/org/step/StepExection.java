package org.step;


import java.util.Map;

import org.base.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.sample.PojoTask1;
import org.sample.PojoTask2;
import org.sample.PojoTask3;
import org.sample.PojoTask4;
import org.sample.PojoTask5;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepExection extends utility {
	public PojoTask1 p1;
	public PojoTask2 p2;
	public PojoTask3 p3;
	public PojoTask4 p4;
	
	
	@Given("^Launch the Adactin webpage$")
	public void launch_the_Adactin_webpage() throws Throwable {
		GoogleBrowser();
		toLoadUrl("https://adactinhotelapp.com/");
	maxi();
		
	}

	@When("^Enter the valid usernhaame and passwordtm$")
	public void enter_the_valid_usernhaame_and_passwordtm(DataTable d) throws Throwable {
		Map<String, String> map = d.asMap(String.class, String.class);
		p1=new PojoTask1();
		String user = map.get("username");
		String pass = map.get("password");
		textBox(p1.getTxtUserName(), user);
		textBox(p1.getTxtPass(), pass);
		WebElement login = p1.getToLogin();
		buttonClick(login);
	
	}



	@When("^Fill all the required the details in the adactin page$")
	public void fill_all_the_required_the_details_in_the_adactin_page() throws Throwable {
		 p2=new PojoTask2();
		Map<String, String> map = testCaseExcel("tc3");
		String locate = map.get("location");
		dropDownValue(p2.getLc(), locate);
		String toHotel = map.get("hotel");
		dropDownValue(p2.getHotelName(), toHotel);
		String type = map.get("roomtype");
		dropDownValue(p2.gettRoom(), type);
		String noOfRooms = map.get("number of rooms");
		dropDownValue(p2.getNoRooms(), noOfRooms);
		String ap = map.get("adults per room");
		dropDownValue(p2.getApRoom(), ap);
		String cp = map.get("children per room");
		dropDownValue(p2.getCpRoom(), cp);
		WebElement search = p2.getSearch();
		buttonClick(search);
		
	
	}

	@When("^choose a hotel in available options$")
	public void choose_a_hotel_in_available_options() throws Throwable {
		p3=new PojoTask3();
		p3.getToClickbtn().click();
		p3.getToConBtn().click();
	}

	@When("^Fill all the personal details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"  and card details of \"([^\"]*)\",\"([^\"]*)\" and book the hotel$")
	public void fill_all_the_personal_details_of_and_card_details_of_and_book_the_hotel(String fName, String lName, String bAddress, String cardNO, String CvvNo) throws Throwable {
	    p4=new PojoTask4();
		textBox(p4.getfName(), fName);
		textBox(p4.getlName(),lName);
		textBox(p4.getAdds(), bAddress);
		textBox(p4.getCardNo(), cardNO);
		WebElement cardType = p4.getCardType();
		dropDownIndex(cardType, 1);
		WebElement exMonth = p4.getExMonth();
		dropDownIndex(exMonth, 4);
		WebElement exYear = p4.getExYear();
		dropDownIndex(exYear, 5);
		textBox(p4.getThreeNo(), CvvNo);
		WebElement toBook = p4.getToBook();
		buttonClick(toBook);
		
	}


	@Then("^print the Confirmation order Number$")
	public void print_the_Confirmation_order_Number() throws Throwable {
		System.out.println("order no is generated");
	    
	}



}
