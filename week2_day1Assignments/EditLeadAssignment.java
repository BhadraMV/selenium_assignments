package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//WebElement findElement = driver.findElement(By.id("username"));
		//findElement.sendKeys("Demosalesmanager");---ref
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhadra1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MV");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing_selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		
		Select location =new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		location.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.linkText("11580")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
