package main;

//import Asociacion.*;
//import Composicion.*;
import Herencia.*;


public class Main {

	public static void main(String[] args) {
		
		//Asociación
//		Persona p1= new Persona("Mariana","Giacconi",20);
//		Domicilio d1=new Domicilio("sta maria de oro", 855);
//		p1.setDomi(d1);
//		d1.setEsde(p1);
//		System.out.println("La persona es" +" "+p1.getNombre()+ " "+p1.getApellido()+" "+p1.getEdad());
//		System.out.println("La direccion es"+" " +d1.getCalle()+" "+ d1.getNumero());
		//Composición
		//Persona p2= new Persona("nico","carratala",26,123,"simpre viva");
		
		//System.out.println("La persona es" +" "+p2.getNombre()+ " "+p2.getApellido()+" "+p2.getEdad());
	//Herencia
		Persona p1= new Alumno();
		Alumno a1 = new Alumno();
		System.out.println("El alumno es"+a1.getNombre()+" "+p1.getEdad()+""+a1.getLegajo());
	}
	}

