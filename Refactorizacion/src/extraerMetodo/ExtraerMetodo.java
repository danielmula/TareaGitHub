package extraerMetodo;



public class ExtraerMetodo {
	
	public void Imprimir() {
		//Imprimir cabecera
		imprimirCabecera();
		
		//Imprimir detalles
		imprimirDetalle();
	}

	private void imprimirCabecera() {
		System.out.println("---CABECERA---");
	}

	private void imprimirDetalle() {
		System.out.println("Nombre");
		System.out.println("Apellidos");
		System.out.println("Nombre");
	}

}
