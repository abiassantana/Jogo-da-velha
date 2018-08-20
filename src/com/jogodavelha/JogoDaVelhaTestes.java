package com.jogodavelha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class JogoDaVelhaTestes {

	
	JogoDaVelha jogo;

	@Test
	public void jogoInicia() {
		jogo = new JogoDaVelha();
		jogo.iniciar();
		assertTrue(jogo.jogoiniciado);
	}
	
	@Test
	public void definirPrimeiroJogador() {
		jogo =  new JogoDaVelha();
		jogo.setPrimeiroJogadorX(true);
		assertTrue(jogo.isPrimeiroJogadorX());
	}
	
	@Test
	public void defPrimJogDenovo() {
		jogo = new JogoDaVelha();
		jogo.setPrimeiroJogadorX(true);
		jogo.setPrimeiroJogadorX(false);
		assertFalse(jogo.isPrimeiroJogadorX());
		
	}
	
	@Test
	public void defPrimJogAposIni() {
		jogo = new JogoDaVelha();
		jogo.setPrimeiroJogadorX(true);
		jogo.iniciar();
		jogo.setPrimeiroJogadorX(false);
		assertTrue(jogo.isPrimeiroJogadorX());
	}

}
