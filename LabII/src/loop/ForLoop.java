package loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, soma = 0;
		for (i = 0; i<5; i++) {
			System.out.println("oi");
		}
		
		for (i = 0; i<3;i++) {
			soma = soma+6;
		}
		System.out.println(soma);
		soma=0;
		
		for (i=0; i<6; i++) {
			soma=soma+3;
		}
		System.out.println(soma);
	}

}
