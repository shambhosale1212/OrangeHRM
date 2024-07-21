package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Durations;

public class BaseClass {
	
	private static ThreadLocal<WebDriver> td =new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return td.get();
	}
	
	public static void initialazation(String browsername)
	{
		WebDriver driver= null;
		if(browsername.equalsIgnoreCase("chrome"))
		{
			td.set(new ChromeDriver());
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			td.set(new EdgeDriver());
		}
		else if (browsername.equalsIgnoreCase("incognito"))
		{
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
			
//			ChromeOptions opt = new ChromeOptions ();
//			opt.addArguments("--incognito");
//			driver= new ChromeDriver(opt);
		}
		
		else if (browsername.equalsIgnoreCase("headless"))
		{
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
//			ChromeOptions opt = new ChromeOptions ();
//			opt.addArguments("--headless");
//			driver= new ChromeDriver(opt);
		}
		else
		{
			System.out.println("please enter the correct browsername ");
		}
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(45)).pageLoadTimeout(Duration.ofSeconds(45));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	
}
