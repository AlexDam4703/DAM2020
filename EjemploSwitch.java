
public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diasMes=0;
		int mes=11;
		switch (mes) {
		case 2: diasMes=28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes=31;
			break;
		default:
			diasMes=30;
			break;
		}
		System.out.println("Dias: "+diasMes);
	}

}
