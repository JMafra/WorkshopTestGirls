package tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.InteracoesWeb;
import pages.CreateAccountPage_;
import pages.LoginPage;
import pages.SearchPage;
import pages.PaymentPage;
import utils.Constants;
import utils.DriverContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAutomationPractice_ {
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
	public void testCriarContaUsuario() throws InterruptedException  {
		i.clicar(CreateAccountPage_.linkSignIn);
		i.escrever(CreateAccountPage_.txtEmail, "workshop04@gmail.com");
		i.clicar(CreateAccountPage_.btnCreateAccount);
		i.clicar(CreateAccountPage_.rdbSexoFeminino);
		i.escrever(CreateAccountPage_.txtFirstName, "Juliana");
		i.escrever(CreateAccountPage_.txtLastName, "Mafra");
		i.escrever(CreateAccountPage_.txtPassword, "12345");
		i.selecionar(CreateAccountPage_.cbDays, "5");
		i.selecionar(CreateAccountPage_.cbMonths, "12");
		i.selecionar(CreateAccountPage_.cbYears, "1987");
		i.clicar(CreateAccountPage_.ckNewsletter);		
		i.clicar(CreateAccountPage_.ckPartners);
		
		i.escrever(CreateAccountPage_.txtCompany, "Accenture");
		i.escrever(CreateAccountPage_.txtAddress01, "Av Conselheiro Aguiar");
		i.escrever(CreateAccountPage_.txtAddress02, "Ap 501");
		i.escrever(CreateAccountPage_.txtCity, "Recife");
		i.selecionar(CreateAccountPage_.cbState, "5");
		i.escrever(CreateAccountPage_.txtPostCode, "55555");
		i.selecionar(CreateAccountPage_.cbCountry, "21");
		i.escrever(CreateAccountPage_.txtOther, "informacao adicional");
		i.escrever(CreateAccountPage_.txtPhone, "3333-4455");
		i.escrever(CreateAccountPage_.txtMobilePhone, "88888-9999");
		i.escrever(CreateAccountPage_.txtReference, "proximo ao extra");
		i.clicar(CreateAccountPage_.btSubmitAccount);
		i.validar(CreateAccountPage_.lblUser,"Juliana Mafra" );
	//	i.clicar(CreateAccountPage_.linkSignOut);			
		
	}
	
	@Test
	public void testRealizarCompra() throws InterruptedException  {	
		i.clicar(LoginPage.linkSignIn);
		i.escrever(LoginPage.txtEmail, "workshop01@gmail.com");
		i.escrever(LoginPage.txtPassword, "12345");
		i.clicar(LoginPage.btSingIn);	
	
		i.escrever(SearchPage.txtSearch, "dresses");
		i.confirmar(SearchPage.txtSearch);
		i.clicarLista(SearchPage.itensLista, "Printed Chiffon Dress");
		i.clicar(SearchPage.btQuantity);
		i.selecionar(SearchPage.cbSize, "2");
		i.clicar(SearchPage.btAddCart);	
		i.validarTextoContido(SearchPage.lblConfirmProduct,"Product successfully added to your shopping cart" );
	
		Thread.sleep(2000);
		i.clicar(SearchPage.btProceedCheckout);		
		Thread.sleep(2000);
		i.clicar(PaymentPage.btSigInCheckout);
		i.clicar(PaymentPage.btAddressCheckout);
		i.clicar(PaymentPage.ckShippingTerms);
		i.clicar(PaymentPage.btShippingCheckout);
		i.clicar(PaymentPage.btPayByBank);
		i.clicar(PaymentPage.btConfirmOrder);			
		i.validar(PaymentPage.lblOrderCompleted, "Your order on My Store is complete.");
	}

}
