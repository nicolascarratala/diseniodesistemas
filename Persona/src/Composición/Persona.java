package Composición;


public class Persona {
	
		private String nombre;
		private String apellido;
		private int Edad;
		private Domicilio domi;
		
		//Constructor
		
		public Persona() {
		}
		public Persona(String nombre, String apellido, int edad, int numero, String calle) {
			this.nombre = nombre;
			this.apellido = apellido;
			Edad = edad;
			this.domi = new Domicilio(calle, numero);
		}
		

		//Functions
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return Edad;
		}
		public void setEdad(int edad) {
			Edad = edad;
		}
}
