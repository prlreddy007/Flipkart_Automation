package AER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Common_methods {

// TODO Auto-generated method stub

public static void launch_browserURL() throws InterruptedException{
	//Testcases.driver=new FirefoxDriver();
String appUrl = "http://packit.aerticket.de/";
//launch the firefox browser and open the application url
Testcases.driver.get(appUrl); 
//maximize the browser window
Testcases.driver.manage().window().maximize();
Thread.sleep(1000);
}
public static void log() throws InterruptedException{

Testcases.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
WebElement userid =Testcases.driver.findElement(By.xpath(Locator.username_xpath));
//userid.clear();
userid.sendKeys(Locator.username);

WebElement Password = Testcases.driver.findElement(By.xpath(Locator.password_xpath));
//Password.clear();
Password.sendKeys(Locator.Password);
// click on signin button.
Testcases.driver.findElement(By.xpath(Locator.loginButton_xpath)).click();
Thread.sleep(5000);

}

public static void click_button(String locator_type,String locator_value){

Testcases.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
if (locator_type == "xpath") {
Testcases.driver.findElement(By.xpath(locator_value)).click();
}
else if (locator_type == "class") {
Testcases.driver.findElement(By.className(locator_value)).click();
}
else if (locator_type == "id") {
Testcases.driver.findElement(By.id(locator_value)).click();
}
else 
{
System.out.println("path not found");
}
}

public static void input_method(String locator_type, String locator_value,String input_value) {
Testcases.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
if (locator_type == "id") {
WebElement input_field = Testcases.driver.findElement(By.id(locator_value));
input_field.sendKeys(input_value);
} else if (locator_type == "class") {
WebElement input_field = Testcases.driver.findElement(By.className(locator_value));
input_field.sendKeys(input_value);
} else if (locator_type == "xpath") {
WebElement input_field = Testcases.driver.findElement(By.xpath(locator_value));
input_field.sendKeys(input_value);
}

} 


public static void dropdown_method(String xpath, String text) {
Testcases.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
Select dropdown = new Select(Testcases.driver.findElement(By.xpath(xpath)));
dropdown.selectByVisibleText(text);
}

public static void hoverAndClick(String hovering_element,String elementToClick){
Testcases.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
WebElement elementToHover=Testcases.driver.findElement(By.xpath(hovering_element));
Actions action = new Actions(Testcases.driver);
action.moveToElement(elementToHover).perform();


//Common_methods.click_button(Locator.xpath_type, elementToHover); 
Common_methods.click_button(Locator.xpath_type, elementToClick);

}

public static void clear_locator(String locator_type, String locator_value) {

if (locator_type == "xpath") {
Testcases.driver.findElement(By.xpath(locator_value)).clear();
} else if (locator_type == "id") {
Testcases.driver.findElement(By.id(locator_value)).clear();
} else if (locator_type == "class") {
Testcases.driver.findElement(By.className(locator_value)).clear();
}

}

public static void verify_enable(String element){
	Testcases.driver.findElement(By.xpath(element)).isEnabled();
}
public static void waitforelement(String element){
	WebDriverWait wait = new WebDriverWait(Testcases.driver, 120);	 
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
}



public static void js_Click(String element){
	JavascriptExecutor ex = (JavascriptExecutor)Testcases.driver;
	ex.executeScript("arguments[0].click();",element); 	
	
}

public static void add_FFN(){
	
	
}
public static void add_TSA(){

	Common_methods.click_button(Locator.xpath_type, Locator.TSA_icon);
Common_methods.click_button(Locator.xpath_type, Locator.TSA_confirm);
	
}
public static void add_APIS(){
	
}
public static void add_CUBA(){
	
}


}