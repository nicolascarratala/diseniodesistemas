package Continente;

public class Capital {

	public Provincia  contiene;
	private String Nombre_capital;
	private int anio_de_fundacion;
	
	public Capital() {
	}

	

	public Capital(Provincia contiene, String nombre_capital, int anio_de_fundacion) {
		this.contiene = contiene;
		Nombre_capital = nombre_capital;
		this.anio_de_fundacion = anio_de_fundacion;
	}


	public String getNombre_capital() {
		return Nombre_capital;
	}

	public void setNombre_capital(String nombre_capital) {
		Nombre_capital = nombre_capital;
	}

	public int getAnio_de_fundacion() {
		return anio_de_fundacion;
	}

	public void setAnio_de_fundacion(int anio_de_fundacion) {
		this.anio_de_fundacion = anio_de_fundacion;
	}



}


