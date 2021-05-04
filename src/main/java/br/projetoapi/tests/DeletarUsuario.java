package br.projetoapi.tests;

import static io.restassured.RestAssured.given;
									
import org.junit.Test;

import br.projetoapi.core.BaseTest;

public class DeletarUsuario extends BaseTest {
	
	@Test
	public void deletarUsuario() {
		
				
		     given()
		 	.when()
			.delete("/users/2")
		.then()
			.statusCode(204)
			;
	}

}
