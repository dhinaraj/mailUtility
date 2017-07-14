package mail;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestConfig{


	
	public static String server="smtp.gmail.com";
	public static String from = "dhinaplus65testing"; //enter your username
	
	public static String[] to ={"dhinakaran@plus65.com.sg", "glen@plus65.com.sg", "rohini@plus65.com.sg", "prasad@plus65.com.sg"};
	public static String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	public static String subject = "ArrowMii Automation Test Results"+ " - " + timeStamp;
	/*public static String messageBody ="Report Link: file:///Users/Dhinakaran/Plus65/Automation%20Projects/arrowMeTests/target/site/serenity/index.html";
	public static String attachmentPath="/Users/Dhinakaran/Plus65/Automation Projects/arrowMeTests/target/site/serenity/testreport.jpg";
	public static String attachmentName="TestResults.jpg";*/

	public static String workingDir = System.getProperty("user.dir").split("/src")[0];
	public static String messageBody ="Report Link: file://" + workingDir+ "/target/site/serenity/index.html";
	public static String attachmentPath=workingDir+"/target/site/serenity/testreport.jpg";
	public static String attachmentName="TestResults.jpg" ;
	

	
	
	
	
	
	
	public static String password = "casuarina1"; //enter your password
	
	
}
