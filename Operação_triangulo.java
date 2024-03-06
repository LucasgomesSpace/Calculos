package exercicio_0603;
import java.util.Scanner;
public class Operação_triangulo {

	public static void main(String[] args) {

		double BA, HA, Area; 

		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a Base do triangulo ? ");
		BA = ler.nextDouble();
		System.out.println("Qual a Altura ? ");
		HA = ler.nextDouble();

		Area = (BA * HA)/2 ;

		System.out.println("O valor da área é: " + Area );

	}

}
