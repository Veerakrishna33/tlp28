package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RdetailsPage {
	@FindBy(id="btnRoles")
	WebElement newrcreation;



public void newRolecreationButton() {
	
	newrcreation.click();
	
	
}
}
