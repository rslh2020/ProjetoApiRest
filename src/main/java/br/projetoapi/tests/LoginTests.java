package br.projetoapi.tests;


import org.junit.Test;


import br.projetoapi.core.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class LoginTests extends BaseTest {

	
	
	@Test
	public void efetuarLoginComSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("email","eve.holt@reqres.in");
		login.put("password", "cityslicka");
				
		 String token = given()
		 	.body(login)
		.when()
			.post("/login")
		.then()
			.statusCode(200)
			.body("token", is("QpwL5tke4Pnpja7X4"))
			.extract().path("token")
			;
	}
	@Test
	public void efetuarLoginSemSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("email","peter@klaven");
						
		given()
			.body(login)
		.when()
			.post("/login")
		.then()
			.statusCode(400)
			.body("error", is("Missing password"))
			
		;
	}
}
