package ejercicio3;

public class Ciudades {
	public Gastopublico gastopublico;
	public MontoRecaudado montoRecaudado;
	
	public Ciudades() {
		
		montoRecaudado = new MontoRecaudado();
		
	}

	public Ciudades(Gastopublico gastopublico, MontoRecaudado montoRecaudado) {
		super();
		this.gastopublico = gastopublico;
		this.montoRecaudado = montoRecaudado;
	}

	public Gastopublico getGastopublico() {
		return gastopublico;
	}

	public void setGastopublico(Gastopublico gastopublico) {
		this.gastopublico = gastopublico;
	}

	public MontoRecaudado getMontoRecaudado() {
		return montoRecaudado;
	}

	public void setMontoRecaudado(MontoRecaudado montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}

		
	
}