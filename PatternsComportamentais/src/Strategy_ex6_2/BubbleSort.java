package Strategy_ex6_2;

public class BubbleSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] vetor) {

		for (int i = vetor.length - 1; i > 0; i--) {
			for(int j = 0; j <= i -1 ; j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux = vetor[j+1];
					vetor[j+1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		return vetor;
	}
}