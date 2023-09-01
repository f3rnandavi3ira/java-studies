package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	public static void main (String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//float pontoFlutuante = 3.14f; posso colocar o f depois ou (float) na frente do valor pra indicar que não é um double e sim um float
		
		//int x = 2000000000; cabe numeros de até 32 bits e cabem sinais positivos e negativos
		//long numeroGrande = 2000000000000000000l; numero com até 64 bits, precisa colocar um l ou L para indicar que é um long
		//short numeroPequeno = 20000; numero com até 16 bits - 1, é dificil aparecer
		//byte b = 127; 2 elevado a 8, ou seja 256, só vai de -128 até 127; vamos ver quando for sobre entrada e saída de arquivo binario
				
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
}
