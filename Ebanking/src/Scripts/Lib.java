package Scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lib {

	private static final File TakesScreenshot = null;
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties PR;
	public static FileInputStream Fis;
	
	public String Launch(String URL) throws IOException
{
		Expval="Gmail";
		driver=new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        snap(driver,"google"); 
        
       //return "Pass";
    	/*PR=new Properties();
    	Fis=new FileInputStream("E:\\April\\selenium\\src\\Scripts\\Rep.properties");
    	PR.load(Fis);  
    */
     
        driver.findElement(By.linkText("Gmail")).click();
      
      snap(driver,"gmailapr1");
    /*  String Actval=driver.getTitle();
		System.out.println(Actval);
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Gmail page is displayed");	
		return "Pass";
		}
		else
		{
			System.out.println("Gmail page is not displayed");
			
		}
        
*/	
        return "Fail";
}
	public void snap(WebDriver driver,String screenname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Tlp28\\Ebanking\\src\\com\\ebanking\\Results\\"+screenname+".jpg"));
	}
public String Login(String UN,String Pwd) throws IOException, InterruptedException
{
	Thread.sleep(2000);
	  WebDriver.Navigation move=driver.navigate();
	  Thread.sleep(2000);
	driver.findElement(By.id(PR.getProperty("Uname"))).clear();
	driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys(UN);
     driver.findElement(By.id(PR.getProperty("Nxt"))).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath(PR.getProperty("Pwd"))).sendKeys(Pwd);
     Thread.sleep(2000);
     move.back();
     //driver.findElement(By.cssSelector(PR.getProperty("sin"))).click();
    return "gmail success";
}
}
