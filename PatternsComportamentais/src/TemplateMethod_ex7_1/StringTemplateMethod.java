package TemplateMethod_ex7_1;

public abstract class StringTemplateMethod {
	
	public final void transformar(String str) {
		
		alterarString(str);	
	}
	
	public void alterarString(String str) {
		
		
		System.out.println("Resultado: " + str);
	}
}