
public class Suma100Primeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La suma de los 100 primeros es: "+sumar100Primeros());
	}
	public static int sumar100Primeros () {
		int suma =0;
		for(int i =1; i<=100; i++) {
			suma +=i;
		}
		return suma;
	}

}
