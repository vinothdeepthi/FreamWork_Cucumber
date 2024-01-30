package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.ProductPage;
import Utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductFuction extends CommonUtils {
	
    private HomePage home = new HomePage(driver);
    
    private ProductPage pro = new ProductPage(driver);
	
	@Given("User navigate To The dashBoad Page")
	public void user_navigate_to_the_dash_boad_page() {
	   
		System.out.println("successfully Reach dashboard");
	}

	@When("User Entering The Valid Product {string} InTo The SearchText Field")
	public void user_entering_the_valid_product_in_to_the_search_text_field(String string) {
	    
		
		 
		 home.EnteringTheProduct(string);
	}

	@Then("User Should be View given The Products into The Product List Page")
	public void user_should_be_view_given_the_products_into_the_product_list_page() {
	    
		Assert.assertEquals(pro.GetProductName(), "iPhone");
	}

	@When("User Entering The inValid Product {string} InTo The SearchText Field")
	public void user_entering_the_in_valid_product_in_to_the_search_text_field(String string) {
	   
		home.EnteringTheProduct(string);
	}

	@Then("User Should be Get The Proper Error Message")
	public void user_should_be_get_the_proper_error_message() {
	   
		Assert.assertEquals(pro.WithoutProductResult(), "There is no product that matches the search criteria.");
	}

	@When("User Without Entering Any Product InTo The SearchText Field")
	public void user_without_entering_any_product_in_to_the_search_text_field() {
	    
	}
	
	@And("User Click On The Search button")
	public void user_click_on_the_search_button() {
	    
		home.ClickSearchButton();
	}


}
