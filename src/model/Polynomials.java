package model;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Polynomials {

	//Principal

	private Function function;
	private int[] x;

	public Polynomials() {
		// TODO Auto-generated constructor stub
	}
	
	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public void setX(int[] x) {
		this.x = x;
	}
	
	public double bisectionMethod(String f, int min, int max) {
		System.out.println("Entró");
		double mi = 0;
		double ma = 0;
		double mm = 0;
		double x = 0;
		int r = 0;
		
		function = new Function(f);
		mi = function.f(min);
		ma = function.f(max);
		if(Math.abs(mi * ma) > 0) {
			do {
				
				r++;
				x = (mi + ma) / 2;
				mm = function.f(x);
				if(mi * mm < 0) {
					ma = x;
				}else {
					mi = x;
				}
			}while(Math.abs(mm) > 0.001 && r <= 500);
		}
		return x;
	}
	

	public double newtonRaphson(String f, double p0) {	
	
		DJep Function = new DJep();
        double root = 0;
        boolean cont = false;
        double derx = 0;
        double funx = 0;
        double p = 0;
        String derivade = "";
        int iMax = 200;
        int n = 0;
        double Es = 0.5 - (int)(Math.pow(10, 3));
        System.out.println("Esta es ES: "+Es);

        Function.addStandardFunctions();
        Function.addStandardConstants();
        Function.addComplex();
        Function.setAllowUndeclared(true);
        Function.setAllowAssignment(true);
        Function.setImplicitMul(true);
        Function.addStandardDiffRules();

        try {
            Node node = Function.parse(f);
            Node different = Function.differentiate(node, "x");
            Node simplify = Function.simplify(different);
            derivade = Function.toString(simplify);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        while (cont == false && n < iMax ) {

            try {
                // Solucion de la derivada
                Function.addVariable("x", p0);
                Node dx = Function.parse(derivade);
                Node fx = Function.parse(f);

                if (Function.evaluate(fx) != null) {
                    funx = Double.valueOf(Function.evaluate(fx).toString());
                    derx = Double.valueOf(Function.evaluate(dx).toString());
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

            p = p0 - (funx / derx);
            double error = (p - p0) / p;
            
            if (error <= Es || error == 0) {
            	 
                root = p;
                cont = true;
            } else {
                p0 = p;
            }
            n++;
        }

        return root;
		
	}

	public int[] polynomialRandom() {
	
		int grade = (int) (Math.random() *11 + 1);
		 x = new int[grade];
		System.out.println("tamaño - "+ grade);
		for(int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100 + 1);
		}
		
		return x;
	}
	
	
	
	
//	public static void main(String[] args) {
//
//		Polynomials p = new Polynomials();
//		System.out.println("Holaaaaa"+p.bisectionMethod("x-4", 0, 5));
//	}
	

}
