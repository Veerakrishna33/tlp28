package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscripts2 {
public static void main(String[] args) throws Exception {
		
		String Expval="Ranford Bank";
		
	WebDriver driver =new FirefoxDriver();
	driver.get("http://183.82.100.55/ranford2/");
	driver.manage().window().maximize();
	
	String Actval =driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	
	//Comparision
	
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Ranford Application Launch Succ");	
			}
			else
			{
				System.out.println("Ranford Application Not Launch");	
			}
			
		//admin login
			Expval="Welcome to Admin";
			Thread.sleep(3000);
			
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("M1ndq");
	driver.findElement(By.name("login")).click();
	
	Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comparision
	
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Admin Login Succ");	
			}
			else
			{
				System.out.println("Admin Login Failed");	
			}
			
			
	//branch
			
			Expval="Sucessfully";
			
			
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	
	driver.findElement(By.name("txtbName")).sendKeys("mindq28");
	driver.findElement(By.id("txtAdd1")).sendKeys("srnagar");
	driver.findElement(By.id("Txtadd2")).sendKeys("betada");
	driver.findElement(By.id("txtadd3")).sendKeys("haripur");
	driver.findElement(By.id("txtArea")).sendKeys("sora");
	driver.findElement(By.id("txtZip")).sendKeys("12345");
	
	Select country =new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByVisibleText("INDIA");
	
	new Select(driver.findElement(By.name("lst_stateI"))).selectByVisibleText("Andhra Pradesh");
	new Select(driver.findElement(By.name("lst_cityI"))).selectByVisibleText("Hyderabad");
	driver.findElement(By.id("btn_insert")).click();
	
	Thread.sleep(4000);
	
	//Alert
	
	Actval=driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	
	//Comparision
	
			if (Actval.contains(Expval)) 
			{
			System.out.println("Branch Created");	
			}
			else
			{
				System.out.println("Branch Already Exist");
			}
			
	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
	
	
	//role
	Expval="Sucessfully";
	
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.id("btnRoles")).click();
	driver.findElement(By.name("txtRname")).sendKeys("mindqtlp");
	new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText("E");
	driver.findElement(By.id("btninsert")).click();
	
Thread.sleep(4000);
	
	//Alert
	
	Actval=driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	

	//Comparision
	
			if (Actval.contains(Expval)) 
			{
			System.out.println("Role Created");	
			}
			else
			{
				System.out.println("Role Already Exist");
			}
	
	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
	
	//employee
	
	Expval="Sucessfully";
	
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
	driver.findElement(By.id("BtnNew")).click();
	driver.findElement(By.name("txtUname")).sendKeys("veera");
	driver.findElement(By.name("txtLpwd")).sendKeys("mindq28");
	new Select(driver.findElement(By.id("lst_Roles"))).selectByVisibleText("mindqtlp");
	new Select(driver.findElement(By.id("lst_Branch"))).selectByVisibleText("mindq28");
	driver.findElement(By.id("BtnSubmit")).click();
	
Thread.sleep(4000);
	
	//Alert
	
	Actval=driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	

	//Comparision
	
			if (Actval.contains(Expval)) 
			{
			System.out.println("Employee Created");	
			}
			else
			{
				System.out.println("Employee Already Exist");
			}
			
	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
	
	//logout
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
	
	//banker login
	
	Expval="Welcome to mindq28 Branch";
	Thread.sleep(3000);
	
	new Select(driver.findElement(By.id("drlist"))).selectByVisibleText("mindq28");
	driver.findElement(By.id("txtuId")).sendKeys("rasmianjan");
	driver.findElement(By.id("txtPword")).sendKeys("mindq28");
	driver.findElement(By.id("login")).click();
	
	Actval =driver.findElement(By.xpath("//*[@id=\"Label1\"]")).getText();
	

	//Comparision
	
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Banker Login Succ");	
			}
			else
			{
				System.out.println("Banker Login Failed");	
			}

	}

}
