package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");


	//Create Lead
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement submitbtn = driver.findElement(By.className("decorativeSubmit"));
		submitbtn.click();
		WebElement  CRMsfalink = driver.findElement(By.linkText("CRM/SFA"));
		CRMsfalink.click();
		WebElement leadlink = driver.findElement(By.linkText("Leads"));
		leadlink.click();
		WebElement createleadlink = driver.findElement(By.linkText("Create Lead"));
		createleadlink.click();
		//CompanyName
		WebElement cmpnyname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpnyname.sendKeys("Test Leaf");
		//FirstName
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Naveenraj");
		//Last Name
		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Rajendran");
		//FirstName_Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalNaveen");
		//Last Name_Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LocalRajendran");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DepartmentNaveen");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ash.naveen.kv@gmail.com");
		
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st = new Select(State);
		st.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
	    System.out.println("Title Is"+Title);
		
		//DuplicateLead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Naveens Company");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveenrajjjjj");
		driver.findElement(By.className("smallSubmit")).click();
		
		String DuplicateTitle = driver.getTitle();
	    System.out.println("Duplicate Title Is"+DuplicateTitle);
		
		
		
		
		//String Title = driver.getTitle();
		//System.out.println("Title Is"+Title);
		
	}

}
