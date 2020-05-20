package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Empoylee_Notepad_Text {

	public static void main(String[] args) throws IOException {
	
		Library Lb=new Library();
		 Lb.Lanuch("http://183.82.100.55/ranford2");
			Lb.Admin_Login("Admin","M1ndq");
			String Fpath="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Testdata\\Employee.txt";
			String Rpath="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Results\\REs_Empoyle.txt";
			
			String SD;
			FileReader fr=new FileReader(Fpath);
			BufferedReader  br=new BufferedReader(fr);
			String sread=br.readLine();
			System.out.println(sread);
			
			FileWriter fw=new FileWriter(Rpath);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write(sread);
			bw.newLine();
			
			while ((SD=br.readLine())!=null) 
			{
				System.out.println(SD);
				
				String SR[]=SD.split("###");
				
				      String Eml=SR[0];
				      String pw=SR[1];
				      String role=SR[2];
				      String branch=SR[3];
				      
				      String res=Lb.Empoylee(Eml, pw, role, branch);
				      System.out.println(res);
				      
				      bw.write(SD+"$$$$"+res);
				      bw.newLine();
			}
			bw.close();
			br.close();


	}

}
