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
			}while(Math.abs(mm) > 0.001 && r <= 500);
		}
		return x;
	}
	
	
	public Function getFunction() {
		return function;
	}


	public void setFunction(Function function) {
		this.function = function;
	}


	public double newtonRaphson(String f, int p0) {	
		
		DJep Function = new DJep();
        double root = 0;
        boolean cont = false;
        double derx = 0;
        double funx = 0;
        double p = 0;
        String derivade = "";
        int iMax = 100;
        int n = 0;
        double Es = 0.5 - (int)(Math.pow(10, 3));

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

            if (error <= Es) {
                root = p;
                cont = true;
            } else {
                p0 = (int) p;
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
//	
//		p.polynomialRandom();
//		for (int i = 0; i < p.x.length; i++) {
//			System.out.println(p.x[i]);
//		}
//	}
	

}
