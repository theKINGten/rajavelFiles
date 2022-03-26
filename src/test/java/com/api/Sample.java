package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Sample {
	
	public static void main(String[] args) {
		
		RequestSpecification reqspec ;
		

		reqspec = RestAssured.given();
 
		reqspec.headers("content-Type","application/json");
		
		reqspec = reqspec.queryParam("pet","100");
		
		Response response = reqspec.get("https://petstore.swagger.io/v2/pet/100\r\n" + 
				"");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		
		String asString = body.asString();
		System.out.println(asString);
		
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}

}

//https://petstore.swagger.io/v2/pet/64