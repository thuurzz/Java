package arranjo;

public class Arranjo {
	// Array sugerida
	Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
	public Integer menor() {
		// inicia menor com primeiro item do array.
		int menor = a[0];
		// Percorre o array vendo se o item é menor que o menor.
		for (int i = 0; i < (a.length); i++){
			// Se item for menor, atribui a var menor.
			if (a[i] < menor) {
				menor = a[i];
			}
		}
		// retorna menor valor da array.
		return menor;
	}

	public Integer maior() {
		// inicia maior com primeiro item do array.
		int maior = a[0];
		// Percorre o array vendo se o item é maior que o maior.
		for (int i = 0; i < (a.length); i++){
			// Se item for maior, atribui a var maior.
			if (a[i] > maior) {
				maior = a[i];
			}
		}
		// retorna maior valor da array.
		return maior;
	}

	public int soma() {
		int soma = 0;
		// Percorre o array.
		for (int i = 0; i < (a.length); i++){
			// Soma os itens do array em soma.
			soma = soma + a[i];
		}
		// retorna soma da array.
		return soma;
	}

	public int repeticoes(int i) {
		// Começa qtdades de repetições com 0.
		int rep = 0;
		// Percorre o array.
		for (int j = 0; j < (a.length); j++){
			// Se item do array igual a o procurado(i).
			if (a[j] == i) {
				// Soma 1 ao contador de repetições.
				rep ++;
			}
		}
		// retorna quantidades de vezes que o item aparece na array.
		return rep;
	}

}
