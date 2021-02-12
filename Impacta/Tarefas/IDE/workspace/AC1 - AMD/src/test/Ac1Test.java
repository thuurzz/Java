package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ac1Test {

	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		// Testa se o menor é 510
		assertEquals(510, a.menor(), "O menor deve ser 510");
		
		// Testa se o maior é 940
		assertEquals(940, a.maior(), "O maior é 940");
		
		// Testa se a soma é 7540
		assertEquals(7540, a.soma(), "A soma é 7540");
		
		// Testa a quantidade de vezes que o número 3 aparece
		assertEquals(0, a.repeticoes(3), "O número 3 não aparece nenhuma vez");
		
		// Testa a quantidade de vezes que o número 3 aparece
		assertEquals(1, a.repeticoes(790), "O número 790  aparece uma vez");
		
		// Testa a quantidade de vezes que o número 3 aparece
		assertEquals(2, a.repeticoes(940), "O número 940 aparece 2 vezes");
		
		
	}

}
