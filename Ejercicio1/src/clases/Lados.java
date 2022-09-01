package clases;

public class Lados {

	private Punto estacompuestopor;
	
	public Lados(Punto estacompuestopor) {
		super();
		this.estacompuestopor = estacompuestopor;
	}
	
	public Lados() {
		super();
	}

	public Punto getEstacompuestopor() {
		return estacompuestopor;
	}

	public void setEstacompuestopor(Punto estacompuestopor) {
		this.estacompuestopor = estacompuestopor;
	}	

}