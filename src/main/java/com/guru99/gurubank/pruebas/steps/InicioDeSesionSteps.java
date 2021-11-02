package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.pageobjects.InicioDeSesionPageObject;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {
	
	InicioDeSesionPageObject inicioDeSesionPOM = new InicioDeSesionPageObject();
	
	@Step 
	public void abrirAplicacionGuruBank() {
		inicioDeSesionPOM.open();
	}
	
	@Step
	public void escribirUsuario(String usuario) {
		inicioDeSesionPOM.escribirUsuario(usuario);
	}

	@Step
	public void escribirClave(String clave) {
		inicioDeSesionPOM.escribirClave(clave);
	}
	
	@Step ("Hago click en el btn LogIn")
	public void ClickEnLogIn() {
		inicioDeSesionPOM.clickEnLogIn();
	}
	
	@Step
	public String obtenerTextoAlerta() {
		return inicioDeSesionPOM.obtenerTextoDeAlerta();
	}
}
