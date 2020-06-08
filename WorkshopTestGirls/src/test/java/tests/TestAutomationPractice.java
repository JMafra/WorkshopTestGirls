package tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.InteracoesWeb;
import pages.CreateAccountPage;
import utils.Constants;
import utils.DriverContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAutomationPractice {
	static WebDriver driver;
	InteracoesWeb i = new InteracoesWeb();
	
	@BeforeClass
	public static void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
	}

	@Before
	public  void setUp() {
		DriverContext.getDriver().get("http://automationpractice.com/");
	}
	
	
	@Test
	public void testCriarContaUsuario()  {
		i.clicar(CreateAccountPage.linkSignIn);
		i.escrever(CreateAccountPage.txtEmail, "workshop01@gmail.com");
		i.clicar(CreateAccountPage.btnCreateAccount);
		i.clicar(CreateAccountPage.rdbSexoFeminino);
		i.escrever(CreateAccountPage.txtFirstName, "Juliana");
		i.escrever(CreateAccountPage.txtLastName, "Mafra");
		i.escrever(CreateAccountPage.txtPassword, "12345");
		i.selecionar(CreateAccountPage.cbDays, "5");
		i.selecionar(CreateAccountPage.cbMonths, "12");
		i.selecionar(CreateAccountPage.cbYears, "1987");
		i.clicar(CreateAccountPage.ckNewsletter);		
		i.clicar(CreateAccountPage.ckPartners);
		
	}		

}
