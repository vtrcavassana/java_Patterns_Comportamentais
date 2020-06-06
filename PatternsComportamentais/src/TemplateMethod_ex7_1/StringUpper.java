package TemplateMethod_ex7_1;

public class StringUpper extends StringTemplateMethod {
	
	@Override
	public void alterarString(String str) {
		
		str = str.toUpperCase();
		
		System.out.println("Resultado: " + str);
	}
}