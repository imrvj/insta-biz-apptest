import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class AppiumTest {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	AppiumDriver<MobileElement> driver =null;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Asus");
		caps.setCapability("udid", "FAAZCY247368");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "com.religare");
		caps.setCapability("appActivity", "com.religare.ui.activity.SplashActivity");
		caps.setCapability("noReset", "true");
	
		
				 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 Thread.sleep(3000);
				driver.findElement(By.id("com.religare:id/viewLogin")).click();
				driver.findElement(By.id("com.religare:id/edtAgentId")).sendKeys("20574247");
				driver.findElement(By.id("com.religare:id/edtPassword")).sendKeys("faveo@1234");
				
				//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Spinner/android.widget.TextView")).click();
				//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
				
                  
				driver.findElement(By.id("com.religare:id/btnLogin")).click();
				 


             Thread.sleep(3000);
             
           //  driver.quit();

			
				
			
		
	}

}
