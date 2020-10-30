
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		System.out.println("El factorial de: "+numero+" es: "+factorial(numero));
	}
	public static int factorial (int n) {
		int factorial=1;
		for(int i=2; i<=n; i++) {
			factorial *=i;
		}
		return factorial;
	}

}
