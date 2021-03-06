package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Branch_Notepad_Text {

	public static void main(String[] args) throws IOException {
		 Library Lb=new Library();
		 Lb.Lanuch("http://183.82.100.55/ranford2");
			Lb.Admin_Login("Admin","M1ndq");
			
			String Fpath="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Testdata\\Branch.txt";
			String Lpath="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Results\\REs_branch.txt";
			
			String SD;
			FileReader fr=new FileReader(Fpath);
			BufferedReader  br=new BufferedReader(fr);
			String sread=br.readLine();
			System.out.println(sread);
			
			FileWriter FW=new FileWriter(Lpath);
			BufferedWriter bw=new BufferedWriter(FW);
			
			bw.write(sread);
			bw.newLine();
			
			while ((SD=br.readLine())!=null) 
			{
				System.out.println(SD);
				
				String SR[]=SD.split("###");
				
				      String bname=SR[0];
				      String ad1=SR[1];
				      String ad2=SR[2];
				      String ad3=SR[3];
				      String area=SR[4];
				      String zip=SR[5];
				      String cty=SR[6];
				      String st=SR[7];
				      String city=SR[8];
				      
				      String res=Lb.Branch(bname, ad1, ad2, ad3, area, zip, cty, st, city);
				      System.out.println(res);
				      
				      bw.write(SD+"$$$$"+res);
				      bw.newLine();
			}
			bw.close();
			br.close();
			
	}

}
