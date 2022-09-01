package Composicion;

public class Domicilio {
	
		private String calle;
		private int numero;
		private Persona Esde;
		
		public Domicilio() {
		}
		public Domicilio(String calle, int numero) {
			this.calle = calle;
			this.numero = numero;
		}
		
		public Persona getEsde(Persona Esde) {
			return Esde;
		}
		public void setEsde(Persona Esde) {
			this.Esde = Esde;
		}
		
		public String getCalle() {
			return calle;
		}
		public void setCalle(String calle) {
			this.calle = calle;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
}
