package ejercicio4;
import java.util.Scanner;
public class circulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Radio;
		double Pi = 3.14;
		double Area;
		double Perimetro;
		System.out.print("Intorduce el Radio del circulo : ");
		Radio=sc.nextDouble();
		Area = Pi*(Radio*2);
		Perimetro = (2*Pi) * Radio;
		System.out.println("El aera del circulo es : "+ Area + " y el perimetro es : "+Perimetro);

	}

}
