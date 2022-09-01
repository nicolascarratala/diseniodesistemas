package Herencia;

public class Alumno extends Persona {
	private int legajo;
	
	

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	public Alumno(String nombre, int edad, int legajo) {
		super(nombre, edad);
		this.legajo = legajo;
	}

	

	public Alumno() {
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	
	
}
