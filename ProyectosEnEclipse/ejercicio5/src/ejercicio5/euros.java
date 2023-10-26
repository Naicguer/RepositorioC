package ejercicio5;
import java.util.Scanner;
public class euros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Euros;
		double Dolar;
		double Cambio = 0.05;
		
		System.out.print("Introduce una cantidad de euros  que desea cambiar :");
		Euros= sc.nextDouble();
		Dolar = (Cambio * Euros)+Euros;
		System.out.println("El cambio de euiro a dolar esta a "+Cambio +" por lo que ahora tendra ("+Dolar+" Dolares americanos)");
	}

}
