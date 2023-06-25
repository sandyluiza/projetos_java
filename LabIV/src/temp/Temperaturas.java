package temp;

import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) {
		double quente = 40, frio = 10, normal;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a temperatura atual ");
		normal = ler.nextDouble();
		
		System.out.println(normal);
		
		if(normal == frio) {
			System.out.println("FRIO");
		}
		else if(normal == quente) {
			System.out.println("Quente");
		}
		else if(normal > frio && normal <quente) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Temperatura Extrema");
		}
	}	
}
