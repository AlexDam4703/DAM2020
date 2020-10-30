
public class Temp {
  public static void main(String[] args) { 
     int x = 1;
     while(x<10) { 
       if(x>3) { 
         System.out.println("Hola"); 
       } 
      x++;
    } 
    
  } 
}
// El programa si Compila, sin embargo entra en un bucle infinito, ademas la sentencia System.out.Println("Hola") jamas se lanzaria
//He añadido un contador x++ en el bucle para solucionar este problema