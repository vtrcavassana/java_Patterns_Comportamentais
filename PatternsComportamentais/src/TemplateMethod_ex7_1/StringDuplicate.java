package TemplateMethod_ex7_1;

public class StringDuplicate extends StringTemplateMethod {
	
	@Override
	public void alterarString(String str) {
		
		System.out.println("Resultado: " + str + " " + str);
	}
}