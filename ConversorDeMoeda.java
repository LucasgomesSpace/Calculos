package exercicio_0603;
import java.util.Scanner;
public class ConversorDeMoeda {

	public static void main(String[] args) {
	 double RL, EU; 
	final double cot = 0.19;
	
	 Scanner ler = new Scanner(System.in);
	 System.out.println("Qual o valor em Real sera convertido para Euro? ") ;
	 RL = ler.nextDouble();
	 EU = RL*cot; 
	 System.out.println("Você terá: " + EU + " Euros") ;
	 
	 
	 
	}

}
