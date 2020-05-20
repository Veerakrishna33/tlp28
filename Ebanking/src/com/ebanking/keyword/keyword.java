package com.ebanking.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class keyword {

	public static void main(String[] args) throws Exception {
		Lib LB=new Lib();
		 
		 String Res=null;
		 
		 String Kpath="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\keyword\\keyword_data.xlsx";
		 
		 String Kout="D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\keyword\\keywordRes_data.xlsx";
		
		 
		 FileInputStream fi=new FileInputStream(Kpath);
			
		 //Workbook
			XSSFWorkbook wb=new XSSFWorkbook(fi);
            
			//Sheet
			XSSFSheet ws=wb.getSheet("TestCase");
			XSSFSheet ws1=wb.getSheet("TestSteps");
			
			//XSSFSheet ws2=wb.getSheet("TestData");
			
			
			
			//Row count
			
			int tcRc=ws.getLastRowNum();
	        System.out.println(tcRc);
	        
			int tsRc=ws1.getLastRowNum();
			System.out.println(tsRc);
			
			//test cases

			for (int i = 1;i<=tcRc;i++)
			{
				String exe=ws.getRow(i).getCell(2).getStringCellValue();
				if (exe.equalsIgnoreCase("Y"))
				{
					String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				System.out.println(tcId);
				
				//test steps
					
					for (int j = 1; j <= tsRc ; j++) 
					{
						String tsTcid=ws1.getRow(j).getCell(0).getStringCellValue();
						//System.out.println(tsTcid);
						if (tcId.equalsIgnoreCase(tsTcid))
						{
							String key=ws1.getRow(j).getCell(3).getStringCellValue();
							System.out.println(key);
							switch (key) 
							{
							case "RLanch":
								Res=LB.OpenApp("http://183.82.100.55/ranford2");
								break;
							case "RLogin":
								Res=LB.Adminlogin("Admin","M1ndq");
								break;
							case "RLogout": 	
								LB.logout();
								break;
							case "RBranch":
								LB.Branchcre("mindq28","srnagar","12345","INDIA","Andhra Pradesh","Hyderabad");
								break;
							case "RRole":
								Res=LB.Rolecre("Cashier058","E");
								break;
							case "RClose":
								LB.close();
								break;
							
							default:
								System.out.println("Pass a Valid Keyword");
								break;
							}

							//result updation in test steps sheet
							
							ws1.getRow(j).createCell(4).setCellValue(Res);
							
							//result updation in test case sheet
							
							if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("pass"))
							{
								ws.getRow(i).createCell(3).setCellValue(Res);
							}
							else
							{
								ws.getRow(i).createCell(3).setCellValue("Fail");
							}
							
							
						}
						
						
						
					}
					
				}
				else
				{
					ws.getRow(i).createCell(3).setCellValue("BLOCKED");
				}
			}
			FileOutputStream fo=new FileOutputStream(Kout);
			wb.write(fo);
			wb.close();

		}

		
		


}
