package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//String title = driver.getTitle();
	//System.out.println(title);
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafs");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sasi");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Good Learning Platform");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasisuresh.s@gmail.com");
	//Thread.sleep(2000);
	//driver.close();
    WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select sec=new Select(state);
    sec.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Great");
    driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	}

}
