package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BdetailsPage {
	@FindBy(id="BtnNewBR")
	WebElement newbrcreation;



public void newBrcreation() {
	
	newbrcreation.click();
	
	
}

}
