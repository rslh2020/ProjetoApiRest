package br.projetoapi.core;


import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class BaseTest implements Constantes {
	
	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = APP_BASE_URL;
		RestAssured.port = APP_PORT;
		RestAssured.basePath = APP_BASE_PATH;
		
		RequestSpecBuilder reqBiulder = new RequestSpecBuilder();
		reqBiulder.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = reqBiulder.build();
		
		ResponseSpecBuilder resBuild = new ResponseSpecBuilder();
		resBuild.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		RestAssured.responseSpecification = resBuild.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		
	}	
}
