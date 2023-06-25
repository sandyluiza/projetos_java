
public class MetodoClass {
	static void Welcome() {
		System.out.println("Seja bem vindo!!!");
	}
	
	static int addTwo(int num) {
		int numero = num + 2;
		return numero;
	}
	
	public static void main(String[] args) {
		int tercnum = 3;
		System.out.println(addTwo(tercnum));
		
		tercnum = 19;
		System.out.println(addTwo(tercnum));
		
		Welcome();
		
	}
	
}
