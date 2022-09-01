package ejercicio3;

public class Gastopublico {
	public Mantenimiento mantenimiento;
	
	public Gastopublico() {
		this.mantenimiento = new Mantenimiento();

	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}


	
}