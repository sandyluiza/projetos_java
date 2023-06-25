package vetores;

import java.util.Random;

public class arrais {
	public static void main(String[] args) {
		int vet[] = new int[5], i=0;
		
		while(i < 5) {
			Random random = new Random();
			int numero = 10+random.nextInt(80);
			vet[i]=numero;
			i++;
		}
		
		for(i=0;i<5;i++) {
			System.out.println(vet[i]);
		}
		
		String vetS[]={"Zé","João","Tonho"};
		
		for(i=0;i<3;i++) {
			System.out.println(vetS[i]);
		}
		
		vetS[0]="Maria";
		for(i=0;i<3;i++) {
			System.out.println(vetS[i]);
		}
	}
		
}
