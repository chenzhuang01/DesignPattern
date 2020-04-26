package pattern11_TemplatePattern;

public class DefIntegralXX extends ADefiniteIntegral {
	private double a, b;
	private int c;
	public DefIntegralXX(double a, double b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	protected double geta() {
		// TODO Auto-generated method stub
		return a;
	}

	protected double getb() {
		// TODO Auto-generated method stub
		return b;
	}

	
	protected int getc() {
		// TODO Auto-generated method stub
		return c;
	}

	protected double function(double x) {
		// TODO Auto-generated method stub
		return x;
	}

}
