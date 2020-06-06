package Strategy_ex6_2;

public class QuickSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] vetor) {
		quicksort(vetor , 0 , vetor.length - 1);
		
		return vetor;
	}
	
	public void quicksort(int vetor[], int p, int r) {
		if (p < r) {
			int j = separa(vetor, p, r);
			quicksort(vetor, p, j - 1);
			quicksort(vetor, j + 1, r);
		}
	}
	
	private int separa(int vetor[], int p, int r) {
		
		int c = vetor[p];
		int i = p + 1, j = r;
		while (i <= j) {
			if(vetor[i] <= c)
				i++;
			else if (c < vetor[j])
				j--;
				
			else {
				int troca = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = troca;
				i++;
				j--;
			}
		}
		
		vetor[p] = vetor[j];
		vetor[j] = c;
		
		return j;	
	}
}