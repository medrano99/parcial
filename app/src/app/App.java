/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.List;
import java.util.ArrayList;
import app.interfaces.Vehiculo;
import app.vehiculo.*;
/**
 *
 * @author MEDRANO
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        
        vehiculos.add(new Moto(10000,"2310","susuki"));
        vehiculos.add(new Moto(10000,"cv20","onda"));
        vehiculos.add(new Automovil(15000,"x553","toyota"));
        vehiculos.add(new Camion(20000,"ae45","Volvo"));
        
        for(Vehiculo vehiculo:vehiculos) {
			System.out.println(vehiculo.toString());
		}
    }
    
}
