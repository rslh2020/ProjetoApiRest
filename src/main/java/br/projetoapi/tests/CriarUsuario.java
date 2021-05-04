package br.projetoapi.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.projetoapi.core.BaseTest;

public class CriarUsuario extends BaseTest {
	
	@Test
	public void criarUsuarioComSucesso() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("name","Rony Henrique");
		login.put("job", "QA");
				
		     given()
		 	.body(login)
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.body("name", is("Rony Henrique"))
			.body("job", is("QA"))
			;
	}

}
