package com.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class demoqauiTest {
WebDriver driver;

	

	@Given("User should open the url")
	public void user_should_open_the_url() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://demoqa.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.xpath("//div[text()=' Login ']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	  
	}

	
	
	@When("User should click the element button")
	public void User_should_click_the_element_button()  {
	    
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]")).click();
	    
	}

	@When("User should click the text box and enter all the details")
	public void User_should_click_the_text_box_and_enter_all_the_details() {
	    
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Arav");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Aravind@demoqa.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
	}
	@When("User should click the submit button")
	public void User_should_click_the_submit_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		 
		driver.findElement(By.xpath("//button [@Id='submit']")).click();
		

		  
		
	}
	
	@When("User should click the check box")
	public void User_should_click_the_check_box() {
	    
		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
		driver.findElement(By.xpath("//label[text()='Permanent Address']//following::div//button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		 
		
	}
	@When("User should click the home  button and click workfile.doc")
	public void user_should_click_the_home_button_and_click_workfile_doc() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Word File.doc')]")).click();
		  
		
	}
	@When("User should click the radiobutton option")
	public void user_should_click_the_radiobutton_option() {
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		
	    
	}
	@When("User should click the yes for the answer")
	public void user_should_click_the_yes_for_the_answer() {
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		driver.close();
	    
	}
	@When("User should click the button option")
	public void user_should_click_the_button_option() {
		driver.findElement(By.xpath("//span[normalize-space()='Buttons']")).click();
	   
	}
	@When("User should click the double click")
	public void user_should_click_the_double_click() {
		
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]")); 
		act.doubleClick(ele).perform();
		driver.close();
	}

	@When("User should click the webtable option")
	public void user_should_click_the_webtable_option() {
		driver.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();
	}
	@When("User should click the edit option and submit")
	public void user_should_click_the_edit_option_and_submit() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Arav");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kum");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		

		
	}
	@After("@ui")
	public void closeb()
	{
		driver.close();
	}







}
