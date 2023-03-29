package com.stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqResTest {
	String baseUrl="https://reqres.in/";
	private RequestSpecification reqspec;
	private Response response;

	@Given("Give the domain name of reqres")
	public void give_the_domain_name_of_reqres() {	
		RestAssured.baseURI=baseUrl+"api/users";
		reqspec=RestAssured.given();
	}
	
	@When("send the get request with the resource url of reqres")
	public void send_the_get_request_with_the_resource_url_of_reqres() {
		response =reqspec.get("?page=1");
	}
	
	@Then("validate the response code of reqres")
	public void validate_the_response_code_of_reqres() {
		Assert.assertEquals(200, response.getStatusCode());
		//Assert.assertEquals(response.getBody().jsonPath().get("data[0].id"),1);
	}

	@Then("validate the response code get of reqres")
	public void validate_the_response_code_get_of_reqres() {
		Assert.assertEquals(200, response.getStatusCode());
		//Assert.assertEquals(response.getBody().jsonPath().get("data.id"),2);
	}
	
	@When("send the get request with the single resource url of reqres")
	public void send_the_get_request_with_the_single_resource_url_of_reqres() {
		response =reqspec.get("/2");		
	}
	
	@When("send get request in server of reqres")
	public void send_get_request_in_server_of_reqres() {		
		response =reqspec.get("/23");
	}
	
	@Then("validate the negative response code of reqres")
	public void validate_the_negative_response_code_of_reqres() {
		Assert.assertEquals(404, response.getStatusCode());
	}

	@When("delete user in server of reqres")
	public void delete_user_in_server_of_reqres() {
		response =reqspec.delete("/2");
	}
	
	@When("Get delayed response in server of reqres")
	public void get_delayed_response_in_server_of_reqres() {
		response =reqspec.get("?delay=3");
	}


	@Then("validate the delete response code of reqres")
	public void validate_the_delete_response_code_of_reqres() {
		Assert.assertEquals(204, response.getStatusCode());
	}

}
