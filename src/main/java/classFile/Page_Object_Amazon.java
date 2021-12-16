package classFile;

import org.openqa.selenium.*;

public class Page_Object_Amazon {
	private static WebElement element = null;
	public static WebElement search_tool(WebDriver driver) {
	      element = driver.findElement(By.id("twotabsearchtextbox"));
	      return element;
	}
	public static WebElement click_button(WebDriver driver) {
		element = driver.findElement(By.id("nav-search-submit-button"));
			return element;
	}  
	public static WebElement click_object(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
		   return element;
	}
	public static WebElement get_price(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[9]/div[4]/div[4]/div[11]/div[1]/div/table/tbody/tr/td[2]/span[1]/span[2]"));
		   return element;
	}
	}