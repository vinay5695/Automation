package com.stepDefinitions;

import POJO.employee;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.params.CoreConnectionPNames;
import org.testng.*;

public class employeeApiTest {
	
	private static final String baseUrl ="http://localhost:3000/Employees";
	private RequestSpecification reqspec;
	private Response response;
	private RestAssuredConfig config;

	@Given("Give the domain name of Employee")
	public void give_the_domain_name_of_Employee() {	
		RestAssured.baseURI=baseUrl;
		reqspec=RestAssured.given().config(apiwait());
	}
	
	@When("send the get request with the resource url")
	public void send_the_get_request_with_the_resource_url() {
		response =reqspec.get();
	}
	
	@Then("validate the response code")
	public void validate_the_response_code() {
		Assert.assertEquals(200, response.getStatusCode());
	}

	@Then("validate the response code get")
	public void validate_the_response_code_get() {
		Assert.assertEquals(200, response.getStatusCode());
		employee emp=response.as(employee.class);
	    Assert.assertEquals(emp.getId(), 2);
	}
	
	@When("send the get request with the single resource url")
	public void send_the_get_request_with_the_single_resource_url() {
		response =reqspec.get("/2");
	}
	
	@When("add user in server")
	public void add_user_in_server() {		
		employee emp=new employee();
		emp.setId(19);
		emp.setfirstName("mark");
		emp.setlastName("man");
		reqspec.header("content-type","application/json");
		reqspec.body(emp);
		response=reqspec.post();
	}
	
	@Then("validate the post response code")
	public void validate_the_post_response_code() {
		Assert.assertEquals(201, response.getStatusCode());
	}

	@When("delete user in server")
	public void delete_user_in_server() {
		response =reqspec.delete("/19");
	}
	
	@When("update user in server")
	public void update_user_in_server() {
		employee emp=new employee();
		emp.setfirstName("steve");
		emp.setlastName("jobs");
		reqspec.header("content-type","application/json");
		reqspec.body(emp);
		response=reqspec.put("/19");
	}

public RestAssuredConfig apiwait()
{
	config= RestAssured.config()
	   .httpClient(HttpClientConfig.httpClientConfig()
	       .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000)
	       .setParam(CoreConnectionPNames.SO_TIMEOUT, 1000));
	return config;
}







}
