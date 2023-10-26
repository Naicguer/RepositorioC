package ejercicio2;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		//variables
		Scanner sc = new Scanner(System.in);
		Double Trimes1;
		Double Trimes2;
		Double Trimes3;
		Double ResDou;
		
		//codigo
		System.out.println("Introduce la nota de cada trimestre");
		System.out.print("Primer Trimestre: ");
		Trimes1 = sc.nextDouble();
		System.out.print("Segundo Trimestre: ");
		Trimes2 = sc.nextDouble();
		System.out.print("Tercer Trimestre: ");
		Trimes3 = sc.nextDouble();
		ResDou= (Trimes1+Trimes2+Trimes3)/3;
		int redondear =ResDou.intValue();
		if(redondear>=5) {
			System.out.println("Aprobaste progrmacion con una nota final de :"+ redondear);
		}else {
			System.out.println("Suspendiste progrmacion con una nota final de :"+ redondear);
		}
		
		
	}

}
