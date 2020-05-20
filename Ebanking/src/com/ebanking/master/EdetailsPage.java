package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EdetailsPage {

	/**

	  clickenew=BtnNew
      ename=txtUname
      epass=txtLpwd
      erole=lst_Roles
      ebranch=lst_Branch
      esubmit=BtnSubmit
	 **/





	@FindBy(id="BtnNew")
	WebElement newecreation;



	public void newEmployeeButton() {

		newecreation.click();


	}




}
