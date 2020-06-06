package TemplateMethod_ex7_1;

public class StringReverse extends StringTemplateMethod {
	
	@Override
	public void alterarString(String str) {
		
		str = new StringBuilder(str).reverse().toString();
		
		System.out.println("Resultado: " + str);
	}
}