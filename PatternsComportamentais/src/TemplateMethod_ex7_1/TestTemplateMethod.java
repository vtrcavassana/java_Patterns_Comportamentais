package TemplateMethod_ex7_1;

import javax.swing.JOptionPane;

public class TestTemplateMethod {

	public static void main(String[] args) {
		
		StringTemplateMethod stm;
		
		String str = JOptionPane.showInputDialog("Digite uma palavra");
		
		System.out.println("A palavra " + str + " em maiúsculo:");
		stm = new StringUpper();
		stm.transformar(str);
		System.out.println();
		
		System.out.println("A palavra " + str + " em minúsculo:");
		stm = new StringLower();
		stm.transformar(str);
		System.out.println();
		
		System.out.println("A palavra " + str + " duplicado:");
		stm = new StringDuplicate();
		stm.transformar(str);
		System.out.println();
		
		System.out.println("A palavra " + str + " invertido:");
		stm = new StringReverse();
		stm.transformar(str);
		System.out.println();
	}
}