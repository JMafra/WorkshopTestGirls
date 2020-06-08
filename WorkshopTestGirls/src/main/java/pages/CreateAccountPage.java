package pages;

import org.openqa.selenium.By;

public class CreateAccountPage {


	public static By linkSignIn       = By.linkText("Sign in");
	public static By txtEmail         = By.id("email_create");
	public static By btnCreateAccount = By.id("SubmitCreate");
	public static By rdbSexoFeminino  = By.id("id_gender2");
	public static By txtFirstName     = By.id("customer_firstname");
	public static By txtLastName      = By.id("customer_lastname");
    public static By txtPassword      = By.id("passwd");
    public static By cbDays           = By.id("days");
    public static By cbMonths		  = By.id("months"); 
    public static By cbYears		  = By.id("years") ;
    public static By ckNewsletter     = By.id("newsletter");  
	public static By ckPartners		  = By.id("optin"); 	
	
	

}
