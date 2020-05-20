package com.ebanking.master;

import java.io.IOException;

public class Exe_Library_element {

	public static void main(String[] args) throws IOException {
		Library_with_element le=new Library_with_element();
		le.Lanuch();
		le.Admin();
		le.Branch("Chatiu", "Dubai", "Newyork", "Redbus", "Locanto", "53001", "INDIA", "GOA", "GOA");
		le.Role("ChatiuCashier", "check account", "C");
		le.Empoylee("Chatiukampa", "chatiu123", "Test", "123456789");
		le.Admin_Logout();
		le.close();

}
}