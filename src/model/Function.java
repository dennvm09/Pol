package model;

import javax.swing.JOptionPane;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;

public class Function {

	DJep j = new DJep();
	
	public Function(String function) {
		j.addVariable("x", 0);
		j.addStandardConstants();
		j.addStandardFunctions();
		j.parseExpression(function);
		
		if(j.hasError()) {
			System.out.println(j.getErrorInfo());
			JOptionPane.showMessageDialog(null, "La función está mal ingresada"); 
		}
	}
	
	public double f(double x) {
		double result = 0;
		j.addVariable("x", x);
		result = j.getValue();
		
		if(j.hasError()) {
			System.out.println(j.getErrorInfo());
		}
		
		return result;
	}
	
	
//	public static void main(String[] args) {	
//		Function fu = new Function("2*x^4+3*x^3+2*x^2-x+1");
//		System.out.println(fu.f(2));
//	}
}
