package moverMetodo;


public class Pedido {
	
	private double ajusteTotal = 0;
	
	public double getAjusteTotal() {
		return ajusteTotal;
	}

	public void setAjusteTotal(double ajusteTotal) {
		this.ajusteTotal = ajusteTotal;
	}

	public double getTotal() {
		return 100;
	}

	public double aplicarDto(MoverMetodo moverMetodo, double porcentaje) {
		double dto = getTotal() * porcentaje;
		setAjusteTotal(getTotal() - dto);
		return getAjusteTotal();
	}

}

