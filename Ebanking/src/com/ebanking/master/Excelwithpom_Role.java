package com.ebanking.master;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excelwithpom_Role {

	WebDriver driver;
	
    @BeforeTest
	  public void login()
	  {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://183.82.100.55/ranford2");
		  
		  //Pagefactory
		  
		  RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
			RHP.Login();
		  
	  }
  @Test
    public void Rolec() throws IOException
    {
  	
    	

    	//To get Test Data Excel File
    	
    			FileInputStream Fis=new FileInputStream("D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Testdata\\Role.xlsx");
    			
    			//Workbook
    			
    			XSSFWorkbook WB=new XSSFWorkbook(Fis);
    			
    			//Sheet
    			
    			XSSFSheet WS=WB.getSheet("Rdata");
    			
    			//Rowcount
    			
    			int Rcount=WS.getLastRowNum();
    			System.out.println(Rcount);
    			
    			//Multiple Iterations-------Loop
    			
    			//For Loop
    			
    			for (int i=1;i<=Rcount;i++) 
    			{
    			  //Row
    				
    				XSSFRow WR=WS.getRow(i);
    				
    				//Cells
    				
    				XSSFCell WC=WR.getCell(0);
    				XSSFCell WC1=WR.getCell(1);
    				XSSFCell WC2=WR.getCell(2);
    				XSSFCell WC3=WR.createCell(3);
    				
    				//Cell Values
    				
    				String Rname=WC.getStringCellValue();
    				String desc=WC1.getStringCellValue();
    				String Rtyp=WC2.getStringCellValue();
    			

    				AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
    				AHP.adminHPRoles();
		  
		  
		  //New role
		  
    				RdetailsPage rp=PageFactory.initElements(driver, RdetailsPage.class);
    				rp.newRolecreationButton();
		  
		  //Role creation
		 
    				Role_creation rc=PageFactory.initElements(driver, Role_creation.class);
    				rc.rcreation();
		  
		  
		  //Alert
		  driver.switchTo().alert().accept();

		  //Home
		Rhome();
		  
    }
    			
    }

}
