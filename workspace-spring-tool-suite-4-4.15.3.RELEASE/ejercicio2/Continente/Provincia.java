package Continente;

public abstract class Provincia {

	public Cuidad esta_compuesta_por;
	public Provincia esta_delimitado_por;
	private String NombrePro;
	private int cant_habitantes;
	
	public Provincia() {
	}


	public Provincia(Cuidad esta_compuesta_por, Provincia esta_delimitado_por, String nombrePro, int cant_habitantes) {
		this.esta_compuesta_por = esta_compuesta_por;
		this.esta_delimitado_por = esta_delimitado_por;
		NombrePro = nombrePro;
		this.cant_habitantes = cant_habitantes;
	
	}
	public String getNombrePro() {
		return NombrePro;
	}

	public void setNombrePro(String nombrePro) {
		NombrePro = nombrePro;
	}

	public int getCant_habitantes() {
		return cant_habitantes;
	}

	public void setCant_habitantes(int cant_habitantes) {
		this.cant_habitantes = cant_habitantes;
	}
	

	
}
