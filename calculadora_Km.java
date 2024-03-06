package exercicio_0603;
import java.util.Scanner;
public class calculadora_Km {

	public static void main(String[]args) {
		double DT,CM,LTG,VL; 
		final double LT = 5.58,CMK = 10;  

		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a distancisa percorrida? ");

		DT = ler.nextDouble(); 

		CM = DT/CMK; 

		System.out.println("Quantos Litros foram abastecidos? ");
		LTG = ler.nextDouble();

		LTG = LTG - CM; 

		VL = LTG * LT ; 


		System.out.println( "Valor gasto da viagem de um carro que faz 10km por Litros =" + VL );
		System.out.println("foram gastos " + LTG +"Litros");
		System.out.println("O consumo do carro foi de: " +CM);

	}

}
