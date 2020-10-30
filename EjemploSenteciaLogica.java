
public class EjemploSenteciaLogica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalDias;
		int mes = 4;
		if (mes == 1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			totalDias=31;
		}else if (mes ==2) {
			totalDias=28;
		}else {
			totalDias = 30;
		}
		System.out.println("dias del mes: " + totalDias);
	}

}
