package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Brcreation {
	/**
	newbrclick=BtnNewBR
			brnamee=txtbName
			addr=txtAdd1
			zip=txtZip
			ctry=lst_counrtyU
			sta=lst_stateI
			cit=lst_cityI
			btn1=btn_insert
	**/
	
	
	@FindBy(id="txtbName")
	WebElement brname;

	@FindBy(id="txtAdd1")
	WebElement braddress;
	
	@FindBy(id="txtZip")
	WebElement brzip;
	
	@FindBy(id="lst_counrtyU")
	WebElement brcountry;
	
	@FindBy(id="lst_stateI")
	WebElement brstate;
	
	@FindBy(id="lst_cityI")
	WebElement brcity;
	
	@FindBy(id="btn_insert")
	WebElement brsubmit;
	
	
	
	
	public void brcreation() {
		
		
		brname.sendKeys("frfrfrd");
		braddress.sendKeys("jhgfygjhk");
		brzip.sendKeys("33333");
		
		Select sctry=new Select(brcountry);
		sctry.selectByVisibleText("INDIA");

		Select sstate=new Select(brstate);
		sstate.selectByVisibleText("GOA");
		
		Select scity=new Select(brcity);
		scity.selectByVisibleText("GOA");
		
		
		
	}
	
	
	
	public void branchSubmit() {
		
		brsubmit.click();
		
	}
	
	
	
	

}
