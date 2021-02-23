package Dese;


	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;import org.apache.poi.hssf.util.HSSFColor;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFCellStyle;
	import org.apache.poi.xssf.usermodel.XSSFFont;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Act1 {
	

	public static void main(String[] args) throws IOException{
	WebDriver driver = null;
	String projectPath=System.getProperty("user.dir");
	System.out.println("Project path is: " +projectPath);
	System.setProperty("webdriver.chrome.driver",projectPath+
	"C:\\Users\\training\\eclipse-workspace\\Descriptive\\src\\main\\java\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Driver Open");driver.get("https://maveric-systems.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));for(WebElement link:allLinks){
	System.out.println(link.getText() + " - " + link.getAttribute("href"));
	}
	driver.close();
	driver.quit();
	}}


