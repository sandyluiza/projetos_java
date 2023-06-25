package temp;

import java.util.Scanner;

public class usandoCase {
	public static void main(String[] args) {
		int normal;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a temperatura atual ");
		normal = ler.nextInt();
		
		System.out.println(normal);
		
		switch (normal) {
		case 10:
			System.out.println("FRIO");
			break;
		case 40:
			System.out.println("Quente");
			break;
		default:
			System.out.println("Não é quente nem frio.");
			break;
	}
	}
}
