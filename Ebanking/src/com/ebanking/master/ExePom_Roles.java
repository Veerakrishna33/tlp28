package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExePom_Roles {
	@Test
	public void rndHPLogin() {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://183.82.100.55/ranford2/");
		driver.manage().window().maximize();
	
	
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.Login();
		
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.adminHPRoles();
		
		RdetailsPage rp=PageFactory.initElements(driver, RdetailsPage.class);
		rp.newRolecreationButton();

		Role_creation rc=PageFactory.initElements(driver, Role_creation.class);
		rc.rcreation();
		rc.roleSubmit();
	
		
		driver.switchTo().alert().accept();
		
		

		driver.close();
		
		
	}
		
	
	
	
}
