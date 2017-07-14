package mail;
import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestMail {

	
	public static void main(String[] args) throws AddressException, MessagingException, IOException {

		WebDriver driver = new FirefoxDriver();
		String workingDir = System.getProperty("user.dir").split("/src")[0];;
		System.out.println ("Current working directory : " + workingDir);
		driver.get("file://" +workingDir+"/target/site/serenity/index.html");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(workingDir+"/target/site/serenity/testreport.jpg"));
		monitoringMail mail = new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		
	}

}
