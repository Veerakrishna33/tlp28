package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Instance Class
		Library lb=new Library();
		lb.Lanuch("http://183.82.100.55/ranford2");
		lb.Admin_Login("Admin","M1ndq");
		String a=lb.Branch("TestingData1234", "Gachibowil","Adress2","Adress3","Kondapur", "50012", "INDIA", "GOA", "GOA");
		System.out.println(a);
		String b=lb.Role("TestQ", "RoleDe","E");
		System.out.println(b);
		String c=lb.Empoylee("veera", "Veera12@","kamal","123456789");
		System.out.println(c);
		lb.Admin_Logout();
        
		lb.Banker_Login("123456789", "veera", "Veera12@");
		lb.Banker_Logout();
	}

}
