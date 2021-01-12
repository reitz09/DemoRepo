import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public void launchBrowser() {
		
		driver= new ChromeDriver();
		driver.get("https://www.telerik.com");
	}
	
	WebDriver driver;
	
	public static void main(String[] args) {
	
		HelloWorld obj= new HelloWorld();
		obj.launchBrowser();

	}

}
