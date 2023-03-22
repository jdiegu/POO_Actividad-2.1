package agregacion3;
import java.util.Scanner;
public class Agregacion {
	
	public Motor creaMotor() {
		Scanner scn = new Scanner(System.in);
		 /*String valvulas = scn.next();
		 String fabricante = scn.next();
		 float costo = scn.nextFloat();
		return new Motor(valvulas, fabricante, costo);*/
		
		Motor myMotor = new Motor();
		System.out.println("Valvulas?");
		myMotor.setNumValvulas(scn.next());
		System.out.println("Fabricante?");
		myMotor.setFabricante(scn.next());
		System.out.println("Costo?");
		myMotor.setCosto(scn.nextFloat());
		return myMotor;
	}
	
	public Automovil creaAuto() {
	    Motor gasolina = creaMotor();
	    Automovil auto=new Automovil("Toyota","Corolla",345900F,gasolina);
	    
	    return auto;
	}
	    
}
