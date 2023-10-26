package ejercicio3;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		//varaibles
		Scanner sc = new Scanner(System.in);
		double Largo;
		double Ancho;
		double Area;
		double Perimetro;
		//Codigo
		System.out.print("Introduce el largo del rectangulo: ");
		Largo = sc.nextDouble();
		System.out.print("Introduce el ancho del rectangulo: ");
		Ancho = sc.nextDouble();
		Area = Largo * Ancho;
		Perimetro = (Largo*2) + (Ancho*2);
		System.out.println("El area del rectangulo es ("+Area+") y el perimetro es ("+Perimetro+")");

	}

}
