/**
 * 
 * @since 16/05/2018
 * @version 1.0
 * @author Daniel Alcaraz Rodriguez
 *
 */
public class Calculadora {

	private int num1;
	private int num2;
	
	/**
	 * Constructor de calculadora
	 */
	public Calculadora() {
	num1 = 0;
	num2 = 0;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
/**
 * Método que suma num1 + num2
 * @param num1 Es un entero
 * @param num2 Es un entero
 * @return
 */
	public int suma(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * Método que resta num1 - num2
	 * @param num1 Es un entero
	 * @param num2 Es un entero
	 * @return
	 */
	
	public int resta(int num1, int num2) {
		return num1-num2;
	}
	
	/**
	 * Método que multiplica num1 * num2
	 * @param num1 Es un entero
	 * @param num2 Es un entero
	 * @return
	 */
	
	public int multiplicar(int num1, int num2) {
	return num1*num2;
	}
	
	/**
	 * Método que divide num1 / num2
	 * Si el divisor es igual a 0 lanza una excepcion
	 * @param num1 Es un entero
	 * @param num2 Es un entero
	 * @return
	 */
	public int dividir(int num1, int num2) {
		if(num2==0)
			throw new ArithmeticException("El divisor es igual a 0");
		else
		return num1/num2;
	}
	
	/**
	 * Método que devuvle el resto de num1 / num2
	 * Si el divisor es igual a 0 lanza una excepcion
	 * @param num1 Es un entero
	 * @param num2 Es un entero
	 * @return
	 */
	public int resto(int num1, int num2) {
		if(num2==0)
			throw new ArithmeticException("El divisor es igual a 0");
		else
		return num1%num2;
	}
	

	
}
