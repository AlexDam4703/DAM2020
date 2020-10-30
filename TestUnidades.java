
public class TestUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unidades n1 = new Unidades(10);
		System.out.println("Su valor en kilometros es: "+n1.librasKilogramos());
		System.out.println("Su valor de yardas Metros es: " +n1.yardasmetro());
		System.out.println("Su valor de millas a metros es:  " + n1.millasmetro());
		System.out.println("Su valor de acres a hectareas es: "+n1.acresHectareas());
		System.out.println("Su valor de onzas a mililitros es: "  +n1.onzasMililitros());
		System.out.println("Su valor de galones a litros es: " + n1.galonesLitros());
		
	}

}
	class Unidades {
		private double unidad ;
		public Unidades (double n){
			this.unidad = n;
		}
		public double librasKilogramos() {
			return unidad*0.453592;
		}
		public double piesMetros () {
			return unidad*0.3048;
		}
		public double yardasmetro () {
			return unidad *0.9144;
		}
		public double millasmetro () {
			return unidad *1607.34;
		}
		public double acresHectareas () {
			return unidad*0.404686;
		}
		public double onzasMililitros () {
			return unidad*29.5735;
		}
		public double galonesLitros () {
			return unidad*3.78541;
		}
	}
