package com.ebanking.master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	Library_with_element le=new Library_with_element();
	@BeforeSuite
	public void url() throws IOException
	{
		le.Lanuch();
	}
	@BeforeTest
	public void admin() {
		le.Admin();
	}
	@AfterTest
	public void adminlogout() {
		le.Admin_Logout();
	}
	@AfterSuite
	public void close() {
		le.close();
	}

}
