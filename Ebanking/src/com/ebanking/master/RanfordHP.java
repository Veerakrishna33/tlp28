package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {
	//ELEMENT PROPERTIES
	@FindBy(id="txtuId")
	WebElement usname;

	@FindBy(id="txtPword")
	WebElement pass;

	@FindBy(id="login")
	WebElement lgn;

		
		//Element Methods
		
		public void Login() {
			
			usname.sendKeys("Admin");
			pass.sendKeys("M1ndq");
			lgn.click();
		}

}
