package Principal;
import ejercicio3.Ciudades;
import ejercicio3.Gastopublico;
import ejercicio3.Impuestos;
import ejercicio3.Mantenimiento;
import ejercicio3.MontoRecaudado;

import java.util.ArrayList;
import ejercicio3.Pais;
public class Main {
	
	public static void main (String[] args) {
		
		 Pais p1 = new Pais();
         Ciudades c1 = new Ciudades();
         Gastopublico gp1 = new Gastopublico();
         Mantenimiento m1 = new Mantenimiento(341431);
         MontoRecaudado mr1 = new MontoRecaudado();
         Impuestos imp = new Impuestos(0, 0, 0, 0, 0);
         p1.setCiudades(c1);
         c1.setGastopublico(gp1);
         gp1.setMantenimiento(m1);
         mr1.setImpuestos(imp);
         ArrayList<String> ciudades = new ArrayList<String>();
         ciudades.add("Mendoza");
         ciudades.add("San Juan");
         ciudades.add("Cordoba");
         ciudades.add("Santa Fe");
         for (String i : ciudades) {
             System.out.println("La ciudad es:"+ i.toString()+ 
            		 " Su monto Recaudado es: "+mr1.getMontoRecaudado()+
            		 " Su gasto publico es de: "+gp1.getMantenimiento().getMantenimiento());
         }
 
    

	}
}
