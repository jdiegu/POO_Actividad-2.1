package sEcuaciones;
import JOPI.jopi;
import javax.swing.JOptionPane;
public class Administra {
	Sistema sistema;
	
	public Sistema creaSistema() {
		Sistema se = new Sistema();
		return se;
	}
	
	private int gcd(int a , int b){
		int x;
		
		while(b != 0) {
			x = b;
			b = a%b;
			a = x;
		}
		
		return a;
	}
	
	private String simplifica(int a , int b){
		String res="";
		
		if(a < 0 ^ b < 0 ) {
			res ="- ";
			a = Math.abs(a);
			b = Math.abs(b);
		}
		
		if(a%b == 0)
			res += (a/b) ;
		else{
			int div = gcd(a, b);
			res += (a/div) +" / " + (b/div);
		}
		return res;
		
		
	}
	
	public void solucion() {
		sistema = this.creaSistema(); 
		if(sistema.isMultiplos())
			JOptionPane.showMessageDialog(null, "sin solucion \n o \n infinitas soluciones !");
		else
			JOptionPane.showMessageDialog(null, sistema.getEc1().getTerm1().getIncog()+" = "+ simplifica( sistema.sarrusX() , sistema.sarrusA()) +
					" , "+ sistema.getEc1().getTerm2().getIncog() + " = "+ simplifica( sistema.sarrusY() , sistema.sarrusA()));
	}
}
