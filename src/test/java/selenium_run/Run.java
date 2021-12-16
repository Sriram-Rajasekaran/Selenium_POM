package selenium_run;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import classFile.Page_Object_Amazon;

public class Run {
   public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");     
	  WebDriver driver=new ChromeDriver();  
      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();  
      Thread.sleep(2000);
//    Actions actionObject = new Actions(driver);
//    actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
      Page_Object_Amazon.search_tool(driver).sendKeys("laptops");		
      Page_Object_Amazon.click_button(driver).click();
      Page_Object_Amazon.click_object(driver).click();
      String New_price= Page_Object_Amazon.get_price(driver).getText();    
      System.out.println("Actuall Price of laptop" + New_price);
      String expectedvalue = "$100";
		if(New_price == expectedvalue)
		{
			System.out.println("Price is equal to $100");
		}
			System.out.println("Price value is greater then $100");
      driver.close();
   }
}