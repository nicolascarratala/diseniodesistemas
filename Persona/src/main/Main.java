package main;

import Composición.*;

public class Main {

	public static void main(String[] args) {
		
		//Composición
		Persona p2= new Persona("nico","carratala",26,123,"simpre viva");
		
		System.out.println("La persona es" +" "+p2.getNombre()+ " "+p2.getApellido()+" "+p2.getEdad());
		System.out.println("La direccion es"+" " +d2.getCalle()+" "+ d2.getNumero());	
	}

}
