package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void somaTeste() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar 2");
	}

	@Test
	void subtracaoTeste() {
		Calculadora calc = new Calculadora();
		assertEquals(0, calc.sub(1.0, 1.0), "Deve resultar 0");
	}
	
	@Test
	void multiplicacaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(4, calc.mult(2.0, 2.0), "Deve resultar 4");
	}
	
	@Test
	void divisaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(1.0, calc.div(2.0, 2.0), "Deve resultar 4");
	}
	
	@Test
	void potenciacaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(4.0, calc.potenc(2.0), "Deve resultar 4");
	}
}
