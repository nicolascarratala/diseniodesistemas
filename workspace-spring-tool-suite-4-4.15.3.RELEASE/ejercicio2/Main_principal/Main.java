package Main_principal;
import Continente.*;

public class Main {

	public static void main(String[] args) {
		Continente c1= new Continente ( "America", 36);
		Pais p1= new Pais ("Argalia", 25);
		Provincia pro1 = new Provincia ("Salta",1000);
		Provincia pro2 = new Provincia ("Mendoza",1070);
		Provincia pro3 = new Provincia ("La Plata",1023);
		Provincia pro4 = new Provincia ("Humahuaca",1500);
		Cuidad cui1 = new  Cuidad ("Lalant");
		Cuidad cui2 = new  Cuidad ("Brillo");
		Cuidad cui3 = new  Cuidad ("Esperanza");
		Cuidad cui4 = new  Cuidad ("Galleta");
		Capital cap1 = new Capital (pro1, "Argalia.DC", 0);
		

		System.out.println("El Continente"+c1.getNombreC()+""+"y esta compuesto por"+c1.getCant_paises()+""+"Uno de ellos es:"+p1.getNombreP());
		System.out.println("El mismo tiene "+p1.getCant_provincias()+" provincias, ademas cuenta con diferentes ciudades como:"+cui1.getNombreCui()+","+cui2.getNombreCui()+","+cui3.getNombreCui()+","+cui4.getNombreCui()+","+" y una capital llamada "+cap1.getNombre_capital());
	}

}
