package c602.project.cucumberproject;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Feature1Step {
	Feature1Page feature1Page;
	
	@Given("^I open website$")
	public void i_open_website() throws Throwable {
		feature1Page = new Feature1Page();
	    feature1Page.openSite();
	}

	@When("^I enter source$")
	public void i_enter_source() throws Throwable {
	}

	@When("^I enter destination$")
	public void i_enter_destination() throws Throwable {
	}

	@When("^I click Search buses button$")
	public void i_click_Search_buses_button() throws Throwable {
	}

	@Then("^Calendar should open$")
	public void calendar_should_open() throws Throwable {
	Assert.assertTrue(false);
	}
	
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		feature1Page.closeBrowser();
	}
}
