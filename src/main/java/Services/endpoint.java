package Services;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.apache.http.HttpStatus;
import org.junit.Test;

public class endpoint {

    private String END_POINT ="http://restapi.demoqa.com/utilities/weather/city/";
    @Test
    public void testGetByCity(){
        String city = "city: Hyderabad";

        given().
                param("q", city).
                when().
                get(END_POINT)
                .then().
                statusCode(HttpStatus.SC_OK);

    }
}
