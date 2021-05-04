package br.projetoapi.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.projetoapi.core.BaseTest;
import br.projetoapi.tests.RegistrarUsuarioTests;
import br.projetoapi.tests.AtualizarUsuario;
import br.projetoapi.tests.CriarUsuario;
import br.projetoapi.tests.DeletarUsuario;
import br.projetoapi.tests.LoginTests;

@RunWith(Suite.class)
@SuiteClasses({
	RegistrarUsuarioTests.class,
	LoginTests.class,
	CriarUsuario.class,
	AtualizarUsuario.class,
	DeletarUsuario.class
})

public class SuiteTests extends BaseTest {

}
