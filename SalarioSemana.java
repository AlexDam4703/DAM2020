
public class SalarioSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas = 30;
		System.out.println("Este trabajador con "+horas+" horas cobra un salario semanal del: "+salarioSemanal(horas)+"€");
	}
	public static double salarioSemanal(int n) {
		if(n<=40)
			return n*10;
		return ((n-40)*12)+(40*10);
	}

}
