package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscripts {

	public static void main(String[] args) 
	{
		
		//Launch Firefox browser
		
		WebDriver driver=new FirefoxDriver();
		
		//URL
		
		driver.get("http://183.82.100.55/ranford2");
		 
		
		//maximize 
		driver.manage().window().maximize();
		
		
		
		
		
		//Admin login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.id("login")).click();
		
		//comparision
		
		
		
		
		//Branch creation
		
/*		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BtnNewBR\"]")).click();
		
		//Branchname
		
		driver.findElement(By.id("txtbName")).sendKeys("Krishna123");
		driver.findElement(By.id("txtAdd1")).sendKeys("Veera123@");
		driver.findElement(By.id("txtZip")).sendKeys("50003");
		
		//Drop down
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		Select State=new Select(driver.findElement(By.id("lst_stateI")));
		State.selectByVisibleText("Andhra Pradesh");
		
		Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
		Cty.selectByVisibleText("Hyderabad");
		
		driver.findElement(By.id("btn_insert")).click();
		
		//Alert
				driver.switchTo().alert().accept();
				
				//Home
				
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
	
	// Role creation
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
				
				driver.findElement(By.id("btnRoles")).click();
				driver.findElement(By.id("txtRname")).sendKeys("KRISHNA");
				driver.findElement(By.id("txtRDesc")).sendKeys("RAMU");
			
				Select Rtype=new Select(driver.findElement(By.id("lstRtypeN")));
				Rtype.selectByVisibleText("E");
				driver.findElement(By.id("btninsert")).click();
				//Alert
				driver.switchTo().alert().accept();
				
				
				//HOME
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[1]/a/img")).click(); 
				
				//Employee cretion
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
				driver.findElement(By.id("BtnNew")).click();
				driver.findElement(By.id("txtUname")).sendKeys("KRISHNA12");
				driver.findElement(By.id("txtLpwd")).sendKeys("Veera123@");
				Select Role=new Select(driver.findElement(By.id("lst_Roles")));
				Role.selectByVisibleText("RAM123");
				Select Branch=new Select(driver.findElement(By.id("lst_Branch")));
				Branch.selectByVisibleText("srnagar");
				driver.findElement(By.id("BtnSubmit")).click();
				
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img")).click();
				
				driver.close(); */
			
				
	}

}
