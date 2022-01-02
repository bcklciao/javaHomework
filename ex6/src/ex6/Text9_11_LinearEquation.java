package ex6;

public class Text9_11_LinearEquation {
	double a,b,c,d,e,f;
	public Text9_11_LinearEquation(int a,int b,int c,int d,int e,int f) {
		this.a=a;
		this.b=b;
		this.c=c;	
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
