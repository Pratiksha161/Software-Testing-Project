package Tejas_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tea_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().browserPath("95.0.4638.54").setup();
		  WebDriverManager.chromedriver().setup();
		  WebDriver w= new ChromeDriver();
w.get("http://www.practiceselenium.com");
w.findElement(By.linkText("See Collection")).click();
w.findElement(By.linkText("Check Out")).click();
w.findElement(By.id("email")).sendKeys(" nitishaaghav123@gmail.com");
w.findElement(By.id("name")).sendKeys("Nitisha Aghav");
w.findElement(By.id("address")).sendKeys("Sudama Bhel Pune");
Select s=new Select(w.findElement(By.id("card_type")));
s.selectByVisibleText("Mastercard");
w.findElement(By.id("card_number")).sendKeys("222-222-2222");
w.findElement(By.id("cardholder_name")).sendKeys("Nitisha Aghav");
w.findElement(By.id("verification_code")).sendKeys("122223");
w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();

w.findElement(By.linkText("Check Out")).click();
w.findElement(By.id("email")).sendKeys(" nishaaghav123@gmail.com");
w.findElement(By.id("name")).sendKeys("Tejas Aghav");
w.findElement(By.id("address")).sendKeys("Rahul Bhel Pune");
Select s1=new Select(w.findElement(By.id("card_type")));
s1.selectByVisibleText("Visa");
w.findElement(By.id("card_number")).sendKeys("333-333-333");
w.findElement(By.id("cardholder_name")).sendKeys("nisha Aghav");
w.findElement(By.id("verification_code")).sendKeys("132343");
w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
Thread.sleep(3000);

w.findElement(By.linkText("More")).click();
w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914882\"]/div/p/a/span")).click();
w.get("http://www.practiceselenium.com/");
w.findElement(By.linkText("seleniumframework.com")).click();
w.findElement(By.linkText("HOME")).click();

w.findElement(By.linkText("TUTORIALS")).click();

w.findElement(By.linkText("PRACTICE")).click();

w.findElement(By.linkText("SELENIUM")).click();

w.findElement(By.linkText("CUCUMBER")).click();

w.findElement(By.xpath("//*[@id=\"main-nav\"]/li[6]/a/span")).click();

w.findElement(By.linkText("ABOUT")).click(); 



	}

}
