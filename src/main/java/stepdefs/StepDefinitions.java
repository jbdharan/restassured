package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class StepDefinitions {

    private RequestSpecification request;
    private Response response;
    private String ENDPOINT_GET_BY_CITY = "http://restapi.demoqa.com/utilities/weather/city/";

    @Given("^The city exists$")
    public void a_city_exists_(String city){
        request = given().param("q", "city:" + city);
    }

    @When("the user retrieves the temperature by city")
    public void the_user_retrieves_the_temperature() {
        response = request.when().get(ENDPOINT_GET_BY_CITY);
        System.out.println("response: " + response.prettyPrint());

    }



}
