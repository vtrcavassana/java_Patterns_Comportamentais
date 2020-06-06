package Strategy_ex6_2;

import javax.swing.JOptionPane;

public class TestStrategy2 {

	public static void main(String[] args) {
		
		 int qtd = 10000;
         int[] vetor = new int[qtd];

         for (int i = 0; i < vetor.length; i++) {
                 vetor[i] = (int) (Math.random()*qtd);
                 
         }
	
         int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Ordenação: \n1 - BubbleSort \n2 - InsertionSort \n3 - SelectionSort \n4 - QuickSort"));
         
		Ordenacao ord = escolhaOrdenacao(i);
		
		long tempoInicial = System.currentTimeMillis();
		
		vetor = ord.ordenar(vetor); 
		
		long tempoFinal = System.currentTimeMillis();
		
		for(int n = 0 ; n < vetor.length ; n++) {
			
			System.out.println(vetor[n]);
		}
		
		 System.out.println("Finalizado em " + (tempoFinal - tempoInicial) + " ms");

	}
	
	
	public static Ordenacao escolhaOrdenacao(int i) {
		Ordenacao ord;
		switch(i) {
		case 1:
			ord = new BubbleSort();
			break;
		case 2:
			ord = new InsertionSort();
			break;
		case 3:
			ord = new SelectionSort();
			break;
		case 4:
			ord = new QuickSort();
			break;
		default:
			ord = null;
		}
		
		return ord;	
	}
}