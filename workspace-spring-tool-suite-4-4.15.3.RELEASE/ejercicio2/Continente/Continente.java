package Continente;

public abstract class Continente {
	
	public Pais posee;
	private String NombreC;
	private int cant_paises;

	public Continente(){

	}


	public Continente(Pais posee, String nombreC, int cant_paises) {
		this.posee = posee;
		NombreC = nombreC;
		this.cant_paises = cant_paises;
	}


	public String getNombreC() {
		return NombreC;
	}

	public void setNombreC(String nombreC) {
		NombreC = nombreC;
	}

	public int getCant_paises() {
		return cant_paises;
	}

	public void setCant_paises(int cant_paises) {
		this.cant_paises = cant_paises;
	}


	
	
}

