package testng1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


@Test
public class NewTest {
	@Test(groups = "app opening")	
	public void opentheapp() {
		System.out.println("open the swiggy app");
	}
	@Test
	public void location() {
		System.out.println("tag your location");
	}
	@Test
	public void placeorder() {
		System.out.println("select the food");
	}
	@Test
	public void restaurantselection() {
		System.out.println("select the restaurant");
	}
	@Test
	public void collectfood() {
		System.out.println("collect the food from delivary partner");
	}
	@Test
	public void billpayment() {
		System.out.println("pay the bill");
	}
	
	
	

}
