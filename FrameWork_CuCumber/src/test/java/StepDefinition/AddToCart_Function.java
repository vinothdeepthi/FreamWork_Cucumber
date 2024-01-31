package StepDefinition;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import Pages.Cart_page;
import Pages.HomePage;
import Pages.ProductPage;
import Utils.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_Function extends CommonUtils {
	
	private HomePage home = new HomePage(driver);
	private ProductPage pro = new ProductPage(driver);
	private Cart_page cart = new Cart_page(driver);
	
	@Given("User Move To The Components Category")
	public void user_move_to_the_components_category() {
	    
		home.MoveToComponents();
		
	}
	@When("User Select The Components Category Product")
	public void user_select_the_components_category_product() {
	    
		home.ClickComponentsCategory();
	}
	
	@When("User Select Desktop Product on {string}")
	public void user_select_Desktop_product_on(String string) {
	    pro.SelectTheProduct(string);
	}
	
	@When("User Select Laptop Product on {string}")
	public void user_select_Laptop_product_on(String string) {
	    pro.SelectTheProduct(string);
	}
	
	@When("User Select Tab Product on {string}")
	public void user_select_tab_product_on(String string) {
	    pro.SelectTheProduct(string);
	}
	
	@When("User Select Component Product on {string}")
	public void user_select_component_product_on(String string) {
	    
		pro.SelectTheProduct(string);
	}

	@When("User given The Product Quantity {string}")
	public void user_given_the_product_quantity(String string) {
	   
		pro.EnterQuantity(string);
	}
	@When("User Click On The AddTo Cart button")
	public void user_click_on_the_add_to_cart_button() {
	    
		pro.AddToCartProduct();
	}
	@Then("User Should Be View The Selected Product {string} Is Successfully Add To The Cart Page")
	public void user_should_be_view_the_selected_product_is_successfully_add_to_the_cart_page(String string) throws InterruptedException {
		
	   try {
		   
		   cart.ClickCart();
			cart.SelectTheProduct(string);

		
	} catch (StaleElementReferenceException e) {
		
		System.err.println(e.getMessage());
	}
	   catch (NoSuchElementException e) {
			
			System.err.println(e.getMessage());
		}
		
}
	
	@Given("User Move To The Desktop Category")
	public void user_move_to_the_desktop_category() {
	    
		home.MoveToDeskTop();
	}
	@When("User Select The Desktop Category Product")
	public void user_select_the_desktop_category_product() {
	   
		home.ClickDeskTopCategory();
	}
	
	@Given("User Move To The Laptop and Notebooks Category")
	public void user_move_to_the_laptop_and_notebooks_category() {
	    
		home.MoveToLaptop();
	}
	@When("User Select The Laptop and Notebooks Category Product")
	public void user_select_the_laptop_and_notebooks_category_product() {
	   
		home.ClickLaptopCategory();
	}
	
	@Given("User Move To The Tab Category")
	public void user_move_to_the_tab_category() {
	    
		
	}
	@When("User Select The Tab Product")
	public void user_select_the_tab_product() {
	    
		home.ClickTab();
	}
	
	
}