package testng;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Test
public class TestngAnnotations {
	
	@Test(dependsOnMethods = "login()")
	public void billpayment() {
		System.out.println("pay the bill to deliver your products");
			}
	@Test(priority=0, groups="amazon")
	public void searchproduct() {
		System.out.println("search for products");
	}

	@Test(priority=-1, groups = "app opening")
	public void openapplication() {
		System.out.println("open the amazon application");
	}

	@Test(priority=1)
	public void addtocart() {
		System.out.println("products add to carts");
	}

	@Test(priority=2)
	public void checkout (){
		System.out.println("choose products to checkout");
	}

	@Test(dependsOnMethods = "checkout()")
	public void login() {
		System.out.println("login with valid credentials");
	}
	@Test(enabled = false)
	public void conclusion() {
		System.out.println("happy selling");
	}



}



