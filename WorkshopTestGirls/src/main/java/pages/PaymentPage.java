package pages;


import org.openqa.selenium.By;

public class PaymentPage {

	
	
	
	public static By btSigInCheckout     = By.xpath("//*[@id='center_column']/p[2]/a[1]");
	public static By btAddressCheckout   = By.xpath("//*[@id='center_column']/form/p/button");
	public static By ckShippingTerms     = By.xpath("//input[@id='cgv']");
	public static By btShippingCheckout  = By.xpath("//*[@id='form']/p/button");
	public static By btPayByBank         = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
	public static By btConfirmOrder      = By.xpath("//*[@id='cart_navigation']/button");
	public static By lblOrderCompleted   = By.xpath("//*[@id=\"center_column\"]/div/p/strong");	
	
}


