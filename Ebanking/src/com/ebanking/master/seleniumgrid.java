package com.ebanking.master;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class seleniumgrid {
	WebDriver driver;
	DesiredCapabilities cap=null;
	  @Parameters("browser")
	   @Test
	   public void Gd(String Br) throws MalformedURLException
	   {
		
		  
		  if (Br.equalsIgnoreCase("firefox"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("firefox");
			   cap.setPlatform(Platform.WINDOWS);
			    	
	    	}
		   
		   else if (Br.equalsIgnoreCase("chrome"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("chrome");
			   cap.setPlatform(Platform.ANY);
			   
		}
	RemoteWebDriver driver =new RemoteWebDriver(new URL("http://192.168.43.152:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	
	driver.get("http://183.82.100.55/ranford2");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.Login();
	
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.adminHPRoles();
	
	   RdetailsPage rp=PageFactory.initElements(driver, RdetailsPage.class);
	   rp.newRolecreationButton();
	   
}

}
