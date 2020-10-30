
public class AmazonRebaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double compra = 250;
		System.out.println("El cliente por una compra de: "+compra+" pagaria: "+rebaja(compra));
	}
	public static double rebaja(double n) {
		if(n>=250)
			return n-((n*15)/100);
		return n;
	}

}
