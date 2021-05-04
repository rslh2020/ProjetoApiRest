package br.projetoapi.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.projetoapi.core.BaseTest;

public class RegistrarUsuarioTests extends BaseTest {
	
	@Test
	public void registrarUsuarioComSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("email","eve.holt@reqres.in");
		login.put("password", "pistol");
		
		String token = given()
			.body(login)
		.when()
			.log().all()
			.post("/register")
			
		.then()
			.statusCode(200)
			.body("id", is(4))
			.body("token", is("QpwL5tke4Pnpja7X4"))
			.extract().path("token")
		;
	}
	
	@Test
	public void registrarUsuarioSemSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("email","eve.holt@reqres.in");
				
		given()
		.body(login)
		.when()
			.post("/register")
		.then()
			.statusCode(400)
			.body("error", is("Missing password"))
		;
	}

}
