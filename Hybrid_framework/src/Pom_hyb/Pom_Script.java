package Pom_hyb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic_Hyb.Base_page;

public class Pom_Script extends Base_page
{
	public WebDriver driver;
	 @FindBy(name="username")
	   private WebElement un;
	   @FindBy(name="password")
	   private WebElement pwd;
	   @FindBy(xpath ="//div[text()='Log in']")
	   private WebElement log;
	   @FindBy(xpath="//a[text()='Log in']")
	   private WebElement log2;
	   @FindBy(xpath = "//span[text()='Sign up']")
	   private WebElement sign;
	   @FindBy(name="emailOrPhone")
	   private WebElement emailTbox;
	   @FindBy(name="fullName")
	   private WebElement fullnameTbox;
	   @FindBy(name="username")
	   private WebElement usernameTbox;
	   @FindBy(name="password")
	   private WebElement password;
	   @FindBy(xpath = "//button[text()='Sign up']")
	   private WebElement signup;
	   
	   public Pom_Script(WebDriver driver)
	   {
		   super(driver);
	   }
	   public void sign()
	   {
		   sign.click();
	   }
	   public void email(String em)
	   {
		   emailTbox.sendKeys(em);
	   }
	   public void fullname(String fn)
	   {
		   fullnameTbox.sendKeys(fn);
	   }
	   public void user(String user)
	   {
		   usernameTbox.sendKeys(user);
	   }
	   public void newpass(String p)
	   {
		   password.sendKeys(p);
	   }
	   public void signup()
	   {
		   signup.click();
	   }
	   public void log2()
	   {
		   log2.click();
	   }
	   public void username(String un1)
	   {
		   un.sendKeys(un1);
	   }
	   public void password(String p)
	   {
		   pwd.sendKeys(p);
	   }
	   public void login()
	   {
		   log.click();
	   }
	   
}
