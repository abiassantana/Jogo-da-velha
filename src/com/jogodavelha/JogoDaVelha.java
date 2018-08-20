package com.jogodavelha;

public class JogoDaVelha {
	boolean jogoiniciado = false;
	boolean primeirojogadorX;
	Boolean [][] tabela = new Boolean [3][3];

	public void iniciar() {
		this.jogoiniciado = true;
	}

	public boolean isiniciado() {
		return jogoiniciado;
	}

	public void setPrimeiroJogadorX(boolean simbPrimJogador) {
		if(jogoiniciado) {
			
		}
		primeirojogadorX = simbPrimJogador;
	}
	
	public boolean isPrimeiroJogadorX() {
		return primeirojogadorX;
	}
}
