package exercicio_0603;
import java.util.Scanner;
public class Calculadora_de_Temperatura {

	public static void main(String[] args) {
		double CL,FH; 

		final double cd1 = 32;

		Scanner ler = new Scanner(System.in); 

		System.out.println("Qual a temperatura em Fahrenheit ");

		FH = ler.nextDouble();  

		System.out.println(" Calculando o valor em Celsius... "); 

		CL = ((FH - cd1) * 5)/9 ;

		System.out.println("Temperatura em Graus Celsius é: " + CL);


	}






}
