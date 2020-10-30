/**
* Esta clase define objetos que contienen un atributo denominado numero
* y posee un método para devolver el valor doble
* @author: Pepillo
* @version: 1.0
*/
class Numero{
	private int numero; //propiedad de los objetos.
	/**
	* Constructor: es un método que tiene el mismo nombre que la clase y se usa para crear objetos
	* @param n parametro para inicializar el objeto
	* se usa para inicializar los objetos
	* de tipo numero
	*/
	public Numero(int n){
		this.numero=n;
	}
	/**
	* metodo que devuelve el valor doble
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	public int calcularDoble(){
		 return this.numero*2;
	}
	
	public int calcularTriple(){
		 return this.numero*3;
	}
	
	public float calcularLaMitad(){
		 return this.numero/2;
	}
	
	public void actualizarAlDoble(){
		 this.numero=this.numero*2;
	}
	
	public void actualizarAlTriple(){
		 this.numero=this.numero*3;
	}	
	
	public void setNumero(int n){
		this.numero=n;	
	}
	
	public int getNumero(){
		return this.numero;
	}
}
//clase para comprobar el funcionamiento de la clase anterior 
public class TestNumeros{
   public static void main(String[] arg){
       //Creo uno objeto de tipo Numero
       
       Numero n1 = new Numero(4);
       System.out.println("Valor actual: "+n1.getNumero()); //4
       System.out.println("Valor actual: "+n1.getNumero()); //8
       System.out.println("Calcular el doble: "+n1.calcularDoble());     //16  //Imprimo su valor doble
       System.out.println("Valor actual: "+n1.getNumero()); //8
       
       n1.setNumero(20);
       System.out.println("Valor actual: "+n1.getNumero()); //20
       
   }
}