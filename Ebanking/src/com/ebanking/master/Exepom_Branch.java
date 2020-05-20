package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom_Branch {
	@Test
	public void rndHPLogin() {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.Login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPBranch();
	

		BdetailsPage Bdetails=PageFactory.initElements(driver, BdetailsPage.class);
		Bdetails.newBrcreation();

		
		Brcreation BRC=PageFactory.initElements(driver, Brcreation.class);
		BRC.brcreation();
		BRC.branchSubmit();
		
		driver.switchTo().alert().accept();
		
		
		driver.close();
		
		
	}
		
}
