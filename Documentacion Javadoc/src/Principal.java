/**
 * 
 * @since 16/05/2018
 * @version 1.0
 * @author Daniel Alcaraz Rodriguez
 *
 */
public class Principal {

	public static void main(String[] args) {

		Calculadora cal=new Calculadora();
		System.out.println("La suma de 10+2 es:  "+cal.suma(10, 2));
		System.out.println("La resta de 10-5 es:  "+cal.resta(10, 5));
		System.out.println("La multiplicacion de 10*3 es:  "+cal.multiplicar(10, 3));
		System.out.println("La division de 4/1 es:  "+cal.dividir(4, 1));
		System.out.println("El resto de 4/1 es:  "+cal.resto(4, 1));
		
	}

}
