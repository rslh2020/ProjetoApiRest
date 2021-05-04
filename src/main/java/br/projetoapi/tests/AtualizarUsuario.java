package br.projetoapi.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.projetoapi.core.BaseTest;

public class AtualizarUsuario extends BaseTest {
	
	@Test
	public void atualizarUsuarioComSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("name","Rony Henrique");
		login.put("job", "Analista Nivel 1");
				
		     given()
		 	.body(login)
		.when()
			.put("/users/2")
		.then()
			.statusCode(200)
			.body("name", is("Rony Henrique"))
			.body("job", is("Analista Nivel 1"))
			;
	}

}
