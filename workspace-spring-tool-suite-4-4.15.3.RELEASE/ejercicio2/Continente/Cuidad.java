package Continente;

public abstract class Cuidad {

	private String NombreCui;
	public Provincia esta_compuesta_por;
	
	
	public Cuidad() {
	}
	public Cuidad(String nombreCui, Provincia esta_compuesta_por) {
		NombreCui = nombreCui;
		this.esta_compuesta_por = esta_compuesta_por;
	}
	
	public String getNombreCui() {
		return NombreCui;
	}
	public void setNombreCui(String nombreCui) {
		NombreCui = nombreCui;
	}
	
}


