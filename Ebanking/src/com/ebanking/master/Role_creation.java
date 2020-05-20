package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Role_creation {

	/**
    rname=txtRname
    rtype=lstRtypeN
    rclick=btninsert
	**/
	
	
	@FindBy(id="txtRname")
	WebElement rname;

	@FindBy(id="lstRtypeN")
	WebElement rtype;
	
	@FindBy(id="btninsert")
	WebElement rsubmit;
	
	
	public void rcreation() {
		
		
		rname.sendKeys("rolennn");
		
		Select r=new Select(rtype);
		r.selectByVisibleText("E");
		
	}
	
	
	
	public void roleSubmit() {
		
		rsubmit.click();
		
	
	}
	
	
}
