package invoke;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		 
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium Final\\chromedriver.exe");
        WebDriver d = new ChromeDriver();  
        
        d.get("http://leaftaps.com/opentaps/control/main");
        d.manage().window().maximize();
        
        // Login page
        d.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
        d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        
        // Home Page
        
        d.findElement(By.xpath("//div[@for=\"crmsfa\"]/a")).click();
        
        d.findElement(By.xpath("//a[text()='Create Lead']")).click();
        
        // Create Leads Fields
        
        d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
        d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ranga");
        d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("prabakar");
        
       
        
        
        
	}

}
