package com.restful.booker.Bookinginfo;


import com.restful.booker.constants.Endpoint;
import com.restful.booker.model.AuthPojo;
import com.restful.booker.model.BookingPojo;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class AuthSteps {
        AuthPojo authPojo = new AuthPojo();


        @Step("Creating token for booking")
        public ValidatableResponse createToken(String username, String password){
                BookingPojo bookingPojo = new BookingPojo();
                return SerenityRest.given().log().all()
                        .header("Content-Type","application/json")
                        .header("Connection","keep-alive")
                        .when()
                        .body(authPojo)
                        .post(Endpoint.CREATE_BOOKING_IDS)
                        .then().log().all().statusCode(200);
        }




        }
