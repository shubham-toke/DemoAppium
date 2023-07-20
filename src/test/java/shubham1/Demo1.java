package shubham1;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Demo1 extends BaseTest{

	@Test
	public void AppiumTest() throws MalformedURLException
	{
		
		//  comman for appium start
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//			service.start();
//			
//			
//			
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("ShubhamEmulator");
//		options.setApp("//Users//shubhamtoke//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
//		
//		
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		// comman appium end
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath ("(//android.widget.RelativeLayout) [2]")) .click();
		
//		assertion to check n compare PoPup text 
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle,"WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("Shubham Wifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		

//		driver.quit();
//		service.stop();
	}
	
}
