package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Polynomials;

public class PolynomialsTest {
	
	
	Polynomials poly;
	
	public void stage1() {
		poly = new Polynomials();
	}
	
	public void stage2() {
		poly = new Polynomials();
	}
	
	@Test
	public void bisectionMethodTest() {
		stage1();
		double root = poly.bisectionMethod("x-4", 0, 5);
		assertEquals(root, 0.375);
	}
	
	@Test
	public void polynomialRandomTest() {
		stage2();		
		
		
		int [] polyarr = poly.polynomialRandom();
		int size = polyarr.length;
		int [] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = polyarr[i];
		}
		assertArrayEquals(polyarr, arr);
		
	}
	
	@Test
	public void newtonRaphsonTest() {
		
	}

}
