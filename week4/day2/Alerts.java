package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		

        //Intializing Chrome Driver
		ChromeDriver driver = new ChromeDriver(); 

		//Loading the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		
	    //Maximizing the Browser Window	
		driver.manage().window().maximize();
		
		//Adding ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Finding PromptBox element and Clicking it
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		
		//Switching the driver focus to the Alert - Providing input in the prompt alert and Dimissing it
		driver.switchTo().alert().sendKeys("Roman Reigns");
		driver.switchTo().alert().dismiss();
		
		//Retrieving the Output text once the alert is cancelled
		String outputText = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(outputText);
		
		driver.close();
	}

}
