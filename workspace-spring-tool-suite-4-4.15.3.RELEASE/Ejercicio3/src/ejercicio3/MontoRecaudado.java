package ejercicio3;

public class MontoRecaudado {

	public Impuestos impuestos;

	public MontoRecaudado(){
		
		
	}
	public void impuesto(Impuestos e) {
		impuestos = e;
	}

	public Impuestos getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(Impuestos impuestos) {
		this.impuestos = impuestos;
	}

	public MontoRecaudado(Impuestos impuestos) {
		super();
		this.impuestos = impuestos;
	}
	


}