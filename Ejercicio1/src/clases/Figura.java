package clases;

public abstract class Figura {	
	private Elipse elipse;
	private Poligono poligono;
	
	public Figura(Elipse elipse, Poligono poligono) {
		super();
		this.elipse = elipse;
		this.poligono = poligono;
	}

	public Figura(){

	}

	public Elipse getElipse() {
		return elipse;
	}

	public void setElipse(Elipse elipse) {
		this.elipse = elipse;
	}

	public Poligono getPoligono() {
		return poligono;
	}

	public void setPoligono(Poligono poligono) {
		this.poligono = poligono;
	}

	
	


}