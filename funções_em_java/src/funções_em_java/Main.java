package funções_em_java;

public class Main {
	
	public static void main(String[] args) {
		double x = 3.0; // declarando variáveis do tipo double
		double y = 4.0; // declarando variáveis do tipo double
		double z = -5.0; // declarando variáveis do tipo double
		double A, B, C;
		A = Math.sqrt(x); // Utilizando a biblioteca math.h com a função raiz quadrada "sqrt"
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A); // Comando de impressão
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y); // Função "pow" da biblioteca math.h que é a função de potencialização
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y); // processando o valor absoluto
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}