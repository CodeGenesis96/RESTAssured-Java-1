package com.codegenesis96;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITest1 {

    @Test
    void test1(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println("Response code for the get request is " + response.getStatusCode());
        System.out.println("Response for the get request is " + response.asString());
        System.out.println("Response body for the get request is " + response.getBody().asString());
        System.out.println("Time taken for the response is " + response.getTime());
        System.out.println("content-type header value for the response is " + response.getHeader("content-type"));

    }

}
