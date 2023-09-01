

package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenChrome {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=SOEYV5HtG86BoAO70bSoBw");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("title");
		
		driver.close();
		
	}

} 
