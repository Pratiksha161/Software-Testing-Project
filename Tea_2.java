package Tejas_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tea_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserPath("95.0.4638.54").setup();
		  WebDriverManager.chromedriver().setup();
		  WebDriver w= new ChromeDriver();
w.get("http://www.seleniumframework.com/");
w.findElement(By.linkText("ABOUT")).click();

w.findElement(By.name("name")).sendKeys("Nisha");
w.findElement(By.name("email")).sendKeys("Nisha123@gmail.com");

w.findElement(By.name("telephone")).sendKeys("1212121212");
w.findElement(By.name("message")).sendKeys("I am fine");
w.findElement(By.linkText("Sign Up Course")).click();
	}

}
