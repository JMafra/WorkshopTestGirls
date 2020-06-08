package pages;


import org.openqa.selenium.By;

public class SearchPage {


	public static By txtSearch         = By.id("search_query_top");			
	public static By itensLista        = By.xpath("//div[@class='product-container']//a[@class='product-name']");	
	public static By btQuantity        = By.xpath("//p[@id='quantity_wanted_p']/a[2]");
	public static By cbSize            = By.id("group_1");	
	public static By btAddCart         = By.name("Submit");
	public static By btProceedCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
	public static By btSummaryCheckout = By.xpath("//*[@id='center_column']/p[2]/a[1]");
	public static By btAddressCheckout = By.name("processAddress");
	public static By lblConfirmProduct = By.xpath("//div[@id='layer_cart']//h2[1]");

	
}


