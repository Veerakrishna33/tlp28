package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Empcreation {

	/**
    ename=txtUname
    epass=txtLpwd
    erole=lst_Roles
    ebranch=lst_Branch
    esubmit=BtnSubmit
	 **/

	
	
	@FindBy(id="txtUname")
	WebElement ename;

	@FindBy(id="txtLpwd")
	WebElement epass;
	
	@FindBy(id="lst_Roles")
	WebElement erole;
	
	@FindBy(id="lst_Branch")
	WebElement ebranch;
	
	@FindBy(id="BtnSubmit")
	WebElement esubmit;
	
	
	
	
	public void empcreation() {
		
		
		ename.sendKeys("frfrfrd");
		
		epass.sendKeys("jhgfygjhk");
		
		Select er=new Select(erole);
		er.selectByVisibleText("pandu");

		Select eb=new Select(ebranch);
		eb.selectByVisibleText("12");
		
	
		
		
		
	}
	
	
	
	public void empSubmit() {
		
		esubmit.click();
		
	}
	
}
