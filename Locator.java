
package AER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator {
WebElement element;
public static final String xpath_type="xpath";
public static final String id_type="id";
public static final String class_type="class";
public static final String css_type="css";

public static final String username= "243809";
public static final String Password= "-AER_18z";
public static final String username_xpath=".//*[@id='user-name']";
public static final String password_xpath=".//*[@id='password']";
public static final String loginButton_xpath=".//*[@id='login-btn']";
public static final String Calculation_popup_ok="html/body/div[1]/div/div/div/div/div/div[3]/div/div/div/a/span";
public static final String origin1=".//*[@id='packit-advanced-search']/div/div[1]/ul/li[1]/div/div[1]/div/div/input[1]";
public static final String destination1=".//*[@id='packit-advanced-search']/div/div[1]/ul/li[1]/div/div[2]/div/div/input[1]";
public static final String origin2=".//*[@id='packit-advanced-search']/div/div[1]/ul/li[2]/div/div[1]/div/div/input[1]";
public static final String destination2=".//*[@id='packit-advanced-search']/div/div[1]/ul/li[2]/div/div[2]/div/div/input[1]";
public static final String datepicker_leg1="(//div[1]/input[1][@class='calendar packit-icon-date'])[1]";
public static final String datepicker_leg2="(//div[1]/input[1][@class='calendar packit-icon-date'])[2]";
public static final String setDate1="//div/div[2]/table/tbody/tr[2]/td[4]/a";
public static final String setDate2="//div[2]/table/tbody/tr[2]/td[4]/a";
public static final String plus_icon=".//*[@id='plus']";
public static final String minus_icon="(//input[@id='minus'])[2]";
public static final String YTH_num=".//*[@id='packit-advanced-search']/div/div[2]/div[1]/div[3]/ul/li[4]/div/input[3]";
public static final String more_search_link="//div[@class='packit-links-section']/a[2]";

public static final String cabinclass=".//*[@id='cabin-class-options']/span[2]";
public static final String cabinmixoption=".//*[@id='packit-advanced-search']/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/ul[2]/li/div/span";
public static final String cabinclass_ok=".//*[@id='packit-leg-section']/div/a[1]/span";
public static final String searchButton=".//*[@id='btnSearchForm']";
public static final String fare1=".//*[@id='aer-flight-results-block']/div/div[1]/div/div[1]/div[2]/div[1]/a/span";
public static final String showpricebreakdown=".//*[@id='aer-flight-results-block']/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[1]/a/span";


public static final String fareicon="//div[1]/div/div[1]/div[1]/div[1]/div[3]/div/a/span/img";
public static final String close_farerules="//button[@class='packit-popup-close-button']";
public static final String farerules_link="html/body/div[1]/div/div/div/div/div/div[2]/div/div[2]/div[2]/p/a";
public static final String bookNow_btn="//div[1]/div[2]/div[2]/div[3]/div/div[1]/a[@class='packit-button-type-a']";
public static final String salutation = ".//*[@id='collapsethree']/div[2]/div/div/div/div[4]/form/div[1]/div[2]/div[1]/div/div/div/div[5]/div/ul/li[1]/div/div";
public static final String salutation_MR=".//*[@id='ui-select-choices-row-17-0']/span";
public static final String title=".//*[@id='collapsethree']/div[2]/div/div/div/div[4]/form/div[1]/div[2]/div[1]/div/div/div/div[5]/div/ul/li[2]/div/div";
public static final String lastname= ".//*[@id='lastname']";
public static final String Givenname= ".//*[@id='givenname']";
public static final String DOB1= "//div[@class='packit-passenger-field-row']/ul/li[5]/div/div/div/input[@name='iconDatePicker']";
public static final String dob_selection=".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a";
public static final String details_proceed=".//*[@id='collapsethree']/div[2]/div/div/div/div[4]/form/div[2]/div/div[1]/input";
public static final String FFN_TSA_APIS_CUBA_icons="//div[2]/div[1]/div/div/div/div[5]/div/ul/li[6]/ul/li/a";
public static final String FFN_program="//div/div/div/div[6]/div/ul/li[1]/div/div/button";
public static final String FFN_number=".//*[@id='FrequestFlyerNumber']";
public static final String FFN_confirm="//div[1]/div[2]/div[1]/div/div/div/div[6]/div/ul/li[4]/div/input";
public static final String TSA_icon=".//*[@id='collapsethree']/div[2]/div/div/div/div[4]/form/div[1]/div[2]/div[1]/div/div/div/div[5]/div/ul/li[6]/ul/li[2]/a";
public static final String TSA_confirm="//div[1]/div[2]/div[1]/div/div/div/div[7]/div/ul[3]/li[1]/div/input";


public static final String plus_minus_days=".//*[@id='packit-advanced-search']/div/div[1]/ul/li/div/div[5]/div/div/div/div[1]/span/i";
public static final String plus_one_day=".//*[@id='ui-select-choices-row-10-1']/span/span[2]";
public static final String days=".//*[@id='packit-advanced-search']/div/div[1]/ul/li/div/div[5]/div/div/div/ul";


}










//************************-------------------******************************------------------------------------------

//package flipkart;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class Locator {
//WebElement element;
//public static final String username= "prlreddy007@gmail.com";
//public static final String Password= "rama123";
//public static final String username_xpath="//div[2]/div/div/div[1]/div/div[4]//div[2][@class='login-input-wrap']/input";
//public static final String password_xpath="//div[2]/div/div/div[1]/div[@class='login-wrap']/div[4]/div[4]/input";
//public static final String loginButton_xpath="//div[@class='new-login-form']/div[7]/input[@value='Login']";
//public static final String cart_icon_classname= "cart-icon";
//public static final String product_xpath= "//img[contains(@class,'product-image')]";
//public static final String buynow_button_xpath= "//input[@value='Buy Now']";
//public static final String name_locator= "name";
//public static final String name_value= "ram";
//public static final String id_pincode= "pincode";
//public static final String pincode_value= "500086";
//public static final String id_address= "address";
//public static final String address_value= "H_no:1/102, kalimandir,Hyderabad";
//public static final String id_city= "city";
//public static final String city_value= "Hyderabad";
//public static final String id_state= "state";
//public static final String state_value= "Telangana";
//public static final String id_phone= "phone";
//public static final String phone_value= "9876543210";
//public static final String save_continue_button_xpath= "//input[@value='Save & Continue']";
//public static final String mobilenum_xpath= "//input[@id='os_mobileNumber']";
//public static final String f_name_xpath="//div[@class='fk-act-pi']/form/div[2]/div[2]/input";
//public static final String l_name_id="last_name";
//public static final String fname_value="Im";
//public static final String lname_value="Leo";
//public static final String gender_dropdown_classname="fk-input";
//public static final String Save_changes_xpath="//div[@class='fk-act-pi']/form/div[5]/div[2]/button";
//public static final String saveChangesAlert_xpath="//div[@class='fk-act-pi']/form/div[6]";
//public static final String account_dropdown_xpath="//ul/li[1]/a[contains(text(),'Account')]";
////".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/ul/li[1]/a";
//public static final String xpath_type="xpath";
//public static final String id_type="id";
//public static final String class_type="class";
//public static final String css_type="css";
//public static final String menuToHover="//ul/li[7]/a[contains(text(),'Hi')]";
//
//public static final String menuInCart="//ul/li[@class='no-border greeting-link']";
////"html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/ul/li/a";
//public static final String logoutToClick="//ul[@class='account-dropdown']/li[10]/a";
//public static final String redTape_Xpath="//ul[@id='brand']/li[contains(@title,'Red Tape')]/a/input";
//
////"//div[@class='facetContainer']//span[text()='Red Tape']/../input";
//////div[@id='facetList']//span[text()='Red Tape']/../input
//
//
//public static final String brownColor_xpath="//div[@class='facetContainer']/ul[@id='color']/li[1][contains(@title,'Brown')]/a";
//public static final String men_xpath="//li/a[text()='Men']";
//public static final String formalShoes_xpath="//li[1]/ul/li[6]/a/span[text()='Formal Shoes']";
////public static final String highprice_xpath="//div[contains(@id,'sortDropdown')]/form/div/span[2]";
//public static final String highprice_xpath="//span[contains(@class,'pointer fk-inline-block') and contains(@value,'sort=price_desc')]";
//public static final String pricetags_xpath="//div[@id='products']/div[1]/div/div/div/div[2]/div[2]/div[1]/span";
//
//public static final String topsearch_xpath="//input[contains(@placeholder,'what are you wishing for today?')]";
//public static final String search_input="formal shoes";
//public static final String search_button="//input[1][@value='SEARCH' or @value='Search']";
//public static final String priceCheckbox_xpath="//ul[@id='price_range']/li[6]/a/input";
//public static final String clearPrice_xpath="//div[2][@class='body']/div[2]/div/div[1]/div/span[1]/a";
//public static final String priceTabOpened_xpath="//div[2]/div[2]/div/div[1]/div[@class='facet-title']";
//public static final String type_xpath="//ul[@id='type']/li[1]/a/input";
//public static final String discount_xpth="//ul[@id='discount_range']/li[4]/a/input";
//public static final String collapseIcon_xpath="//div[@id='facetList']/div[2]/div/div/div[1]/div/span[2]";
//
//// Locators for part2
//public static final String sportsWear_xpath="//div[1]/ul[2]/li[5]/a[contains(text(),'Sports Wear')]";
//public static final String jackets_xpath="//li[contains(text(),'Jackets')]";
//public static final String quickview_xpath="//div/div[1]/a[2]/span[1]";
//
//	//IRCTC Locators
//	public static final String username_Irctc="//table[1]/tbody/tr[1]/td[2]/input[@id='usernameId']";
//	public static final String password_Irctc="//table[1]/tbody/tr[2]/td[2]/input[@class='loginPassword']";
//	public static final String captcha_img_Irctc="//table[2]/tbody/tr[1]/td[1]/img[@id='cimage']";
//	public static final String captcha_input_Irctc="//table[1]/tbody/tr[3]/td[2]/input[@class='loginCaptcha']";	
//	public static final String login_Irctc="//input[@id='loginbutton']";
//	
//	
//	}