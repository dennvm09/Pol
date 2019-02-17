package model;



public class Polynomials {

//	private int polynomialGrade;
//	private ArrayList<Integer> coeficientes;
	
	//Principal
	
	
	private Function function;
	

	public Polynomials() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double bisectionMethod(String f, int min, int max) {
		System.out.println("Entró");
		double mi, ma, mm;
		double x = Double.NaN;
		int r = 0;
		
		function = new Function(f);
		mi = function.f(min);
		ma = function.f(max);
		
		if(mi * ma < 0) {
			System.out.println("Entró 1");
			do {
				r++;
				System.out.println("Entró al do");
				x = (mi + ma) / 2;
				mm = function.f(x);
				if(mi * mm < 0) {
					ma = x;
				}else {
					mi = x;
				}
			}while(Math.abs(mm) > 0.001 && r <= 100);
		}
		return x;
	}
	
	
	public double newtonRaphson(String f, int p0) {	
		
		return 0;
	}
	
	
	
//	public static void main(String[] args) {
//		Polynomials p = new Polynomials();
//		String f = "x-4";
//		int min = 0, max = 5;
//		System.out.println("Hola");
//		System.out.println(p.bisectionMethod(f, min, max));
//		System.out.println("Hola");
//	}
	
	
//	 int getPolynomialGrade() {
//		return polynomialGrade;
//	}
//
//	public void setPolynomialGrade(int polynomialGrade) {
//		this.polynomialGrade = polynomialGrade;
//	}
//
//	public ArrayList<Integer> getCoeficientes() {
//		return coeficientes;
//	}
//
//	public void setCoeficientes(ArrayList<Integer> coeficientes) {
//		this.coeficientes = coeficientes;
//	} 
//	
//	
}
