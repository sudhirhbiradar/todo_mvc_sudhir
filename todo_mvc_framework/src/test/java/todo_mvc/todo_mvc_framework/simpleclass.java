package todo_mvc.todo_mvc_framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleclass {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUD\\Desktop\\drivers and poi\\chromedriver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://todomvc.com/");
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo4");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		
		
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/input")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/button")).click();
		//Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li[3]/div/input")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("/html/body/section/div/section/ul/li[3]/div/button")).click();
		//Thread.sleep(4000);
		
		
		
		driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[3]/a")).click();
		Thread.sleep(4000);
		
		
	//File source	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//File dest=new File("C:\\Users\\SUD\\Desktop\\acttime\\abc.jpeg");
	
	//FileHandler.copy(source, source);
	
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[1]/a")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/button")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("/html/body/section/div/section/ul/li[3]/div/button")).click();
			Thread.sleep(4000);
			
	
	
		
	}
	
	
	
	
	
	
	

}
