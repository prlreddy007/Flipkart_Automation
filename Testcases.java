package AER;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;
//import com.thoughtworks.selenium.Wait;



public class Testcases {

	public static WebDriver driver;
	

    static void search() throws InterruptedException{
    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    Thread.sleep(3000);
    

    WebElement calcultion_ok=driver.findElement(By.xpath(Locator.Calculation_popup_ok));
	    boolean calculation_popupexist = calcultion_ok.isDisplayed();
	    if(calculation_popupexist==true)
	    {
	    	calcultion_ok.click();
	    }
	    else
	    {
			System.out.println("No calculation popup to display");
	    } 
   
    
   
   
   
	Common_methods.clear_locator(Locator.xpath_type,Locator.origin1);
	Common_methods.input_method(Locator.xpath_type,Locator.origin1,"LGW");
	Common_methods.clear_locator(Locator.xpath_type,Locator.destination1);
	Common_methods.input_method(Locator.xpath_type,Locator.destination1,"JFK");
	Common_methods.click_button(Locator.xpath_type,Locator.datepicker_leg1);
	Common_methods.hoverAndClick(Locator.setDate1, Locator.setDate1);
	Common_methods.hoverAndClick(Locator.setDate2, Locator.setDate2);
	WebElement more_search=driver.findElement(By.xpath(Locator.more_search_link));
    if(more_search.isDisplayed()){
    	more_search.click();
    }
    
	Common_methods.click_button(Locator.xpath_type, Locator.YTH_num);
	Common_methods.click_button(Locator.xpath_type,Locator.minus_icon);
	
	Common_methods.click_button(Locator.xpath_type,Locator.plus_minus_days);
	
	Select s= new Select(driver.findElement(By.xpath(Locator.days)));
	s.selectByVisibleText("+/- 1 day");
	Common_methods.clear_locator(Locator.xpath_type, Locator.plus_minus_days);
	
	
	Common_methods.click_button(Locator.xpath_type,Locator.searchButton);
}

    static void Results_1(){
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	
        Common_methods.waitforelement(Locator.fareicon);
    	Common_methods.click_button(Locator.xpath_type,Locator.fareicon);
    	
        String parent = driver.getWindowHandle();
		
		//click on link
        Common_methods.click_button(Locator.xpath_type,Locator.farerules_link); 
		
	
		Set <String> handles = driver.getWindowHandles();
		
		System.out.println("Number of handles after click operation is: "+handles);
		
		for(String window : handles){
			if(!(window.equals(parent))){
				driver.switchTo().window(window);	
				driver.close();
			}
			driver.switchTo().window(parent);
//			if(!(handles.add(window))){
//				driver.switchTo().window(window);
//				System.out.println(driver.getTitle());
//				Thread.sleep(3000);
//				driver.close();
//			}
		}
		Common_methods.click_button(Locator.xpath_type,Locator.close_farerules);
		
		Common_methods.click_button(Locator.xpath_type,Locator.fare1);
		Common_methods.waitforelement(Locator.showpricebreakdown);
		Common_methods.click_button(Locator.xpath_type,Locator.showpricebreakdown);
		Common_methods.click_button(Locator.xpath_type,Locator.bookNow_btn);
    }

    static void Details()
    { 
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	Common_methods.waitforelement(Locator.salutation);
    	Common_methods.click_button(Locator.xpath_type, Locator.salutation);
    	//Common_methods.click_button(Locator.xpath_type, );
    	Common_methods.js_Click(Locator.salutation_MR);
//    	Common_methods.dropdown_method(Locator.salutation, "MR");
//    	Common_methods.dropdown_method(Locator.title, "PROF");
    	Common_methods.input_method(Locator.xpath_type,Locator.lastname,"Sri");
    	Common_methods.input_method(Locator.xpath_type,Locator.Givenname,"rama");
    //	Common_methods.click_button(Locator.xpath_type,Locator.DOB1);
    	Common_methods.js_Click(Locator.DOB1);
    //Common_methods.click_button(Locator.xpath_type,Locator.setDate1);
    	Common_methods.js_Click(Locator.setDate1);
    	Common_methods.add_TSA();
    	
//    	List<WebElement> TSA_iconslist = driver.findElements(By.xpath(Locator.FFN_TSA_APIS_CUBA_icons)); 
//    	for(WebElement w: TSA_iconslist){
//    	if
//    	} 

    	
    }
    static void add_FFN(){
    	
    	
    }
    
   static void add_TSA(){
    	
    }
   static void add_APIS(){
   	
   }
   static void add_CUBA(){
   	
   }

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D://eclipse-jee-kepler-SR2-win32-x86_64/selenium_jar_files/lib/chromedriver.exe");
	driver = new ChromeDriver();
//	driver= new FirefoxDriver();
Common_methods.launch_browserURL();
Common_methods.log();
Testcases.search();
//Testcases.Results_1();
//Testcases.Details();
//driver.close();
System.out.println("The app has quit successfully."); 

}
}