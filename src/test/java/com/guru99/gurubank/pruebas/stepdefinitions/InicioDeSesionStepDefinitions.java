package com.guru99.gurubank.pruebas.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.guru99.gurubank.pruebas.models.Usuario;
import com.guru99.gurubank.pruebas.steps.InicioDeSesionSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioDeSesionStepDefinitions {

	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;
	
	@Dado("^que estoy en la pagina de inicio de GuruBank$")
	public void queEstoyEnLaPaginaDeInicioDeGuruBank() {
		inicioDeSesionSteps.abrirAplicacionGuruBank();
	}

	@Cuando("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> ListaUsuario) {
		inicioDeSesionSteps.escribirUsuario(ListaUsuario.get(0).getUsuario());
		inicioDeSesionSteps.escribirClave(ListaUsuario.get(0).getClave());
		inicioDeSesionSteps.ClickEnLogIn();
	}

	@Entonces("^valido la presencia de una alerta$")
	public void validoLaPresenciaDeUnaAlerta() {
		Assert.assertThat(inicioDeSesionSteps.obtenerTextoAlerta(), Matchers.is("User or Password is not valid"));
	}
}
