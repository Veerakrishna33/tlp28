package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiply_EmployeeNg extends Baseclass{

	@Test(dataProvider = "Data")
	public void Empoyle(String emp,String pw,String role,String branch) {
		le.Empoylee(emp, pw, role, branch);
	}
     
	@DataProvider
	public Object Data() {
		Object[][] obj=new Object[2][4];
		
		obj[0][0]="Charcterabc";
		obj[0][1]="RoleResponsible";
		obj[0][2]="Charcterabc";
		obj[0][3]="Veera123";
		
		obj[1][0]="Charcterabcd";
		obj[1][1]="RoleResponsible";
		obj[1][2]="Charcterabc";
		obj[1][3]="Veera123";
		return obj;
	}
}
