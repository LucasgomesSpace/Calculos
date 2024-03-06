package exercicio_0603;
import java.util.Scanner;
public class Equações_fundamentais {

	public static void main(String[] args) {
		// Variáveis
		double a,b,som,div,sub,mul ;

		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Informe valor 1: ");
		a = ler .nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler .nextDouble();
		//Processamento
		som = a+b; 
		System.out.println("Informe valor 1: ");
		a = ler .nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler .nextDouble();
		//Processamento
		sub = a-b;
		System.out.println("Informe valor 1: ");
		a = ler .nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler .nextDouble();
		//Processamento
		mul = a*b;
		System.out.println("Informe valor 1: ");
		a = ler .nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler .nextDouble();
		//Processamento
		div = a/b;
		//Saida 
		System.out.println("O resultadado da soma é: " + som );
		System.out.println("O resultadado da subtração é: " + sub );
		System.out.println("O resultadado da  multiplicação é: " + mul );
		System.out.println("O resultadado da divisão é: " + div );


	}

}
