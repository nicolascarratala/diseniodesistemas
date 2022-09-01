package Continente;

public abstract class Pais {

	public Capital tiene;
	public Pais limita_con;
	public Provincia esta_compuesto_por;
	private String NombreP;
	private int cant_provincias;
	
	public Pais(){

	}

	public Pais(Capital tiene, Pais limita_con, Provincia esta_compuesto_por, String nombreP, int cant_provincias) {
		this.tiene = tiene;
		this.limita_con = limita_con;
		this.esta_compuesto_por =  esta_compuesto_por;
		NombreP = nombreP;
		this.cant_provincias = cant_provincias;
	}


	public String getNombreP() {
		return NombreP;
	}

	public void setNombreP(String nombreP) {
		NombreP = nombreP;
	}

	public int getCant_provincias() {
		return cant_provincias;
	}

	public void setCant_provincias(int cant_provincias) {
		this.cant_provincias = cant_provincias;
	}
	
	
}




