package sEcuaciones;

public class Sistema {
	private Ecuacion ec1;
	private Ecuacion ec2;
	
	public Sistema() {
		this.ec1 = new Ecuacion();
		this.ec2 = new Ecuacion();
	}
	
	public Ecuacion getEc1() {
		return ec1;
	}
	public void setEc1(Ecuacion ec1) {
		this.ec1 = ec1;
	}
	public Ecuacion getEc2() {
		return ec2;
	}
	public void setEc2(Ecuacion ec2) {
		this.ec2 = ec2;
	}
	
	public int sarrusA() {
		int s;
		s = ec1.getTerm1().getCoef() * ec2.getTerm2().getCoef();
		s-= ec1.getTerm2().getCoef() * ec2.getTerm1().getCoef();		
		return s;
	}
	public int sarrusX() {
		int s;
		s = ec1.getVarInd() * ec2.getTerm2().getCoef();
		s-= ec1.getTerm2().getCoef() * ec2.getVarInd();
		return s;
	}
	
	public int sarrusY() {
		int s;
		s = ec1.getTerm1().getCoef() * ec2.getVarInd();
		s-= ec1.getVarInd() * ec2.getTerm1().getCoef();
		return s;
	}
	
	public boolean isMultiplos() {
		if( this.sarrusA() == 0) 
			return true;
		else
			return false;
	}
		
}
