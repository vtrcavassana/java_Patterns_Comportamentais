package TemplateMethod_ex7_1;

public class StringLower extends StringTemplateMethod {
	
	@Override
	public void alterarString(String str) {
		
		str = str.toLowerCase();
		
		System.out.println("Convertido: " + str);
	}
}