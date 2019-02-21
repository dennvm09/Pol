package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PolynomialsController {
	
	@FXML
	private Button btNewton;
	@FXML
	private Button btBiseccion;
	@FXML
	private Label lblP0;
	@FXML
	private TextField txtP0;
	@FXML
	private Label lblIntervalos;
	@FXML
	private Label lblI1;
	@FXML
	private Label lblI2;
	@FXML
	private Label lblI3;
	@FXML
	private TabPane tabPaneMain;
	@FXML
	private Tab tabOption1;
	@FXML
	private Tab tabOption2;
	@FXML
	private TextField txtx1;
	@FXML
	private TextField txtx2;
	@FXML
	private TextField txtx3;
	@FXML
	private TextField txtx4;
	@FXML
	private TextField txtx5;
	@FXML
	private TextField txtx6;
	@FXML
	private TextField txtx7;
	@FXML
	private TextField txtx8;
	@FXML
	private TextField txtx9;
	@FXML
	private TextField txtx10;
	@FXML
	private TextField txtx11;
	@FXML
	private Label lblPolynomial;
	@FXML
	private Button btSave;
	@FXML
	private TextArea txtRoots;
    @FXML
    private Button btCalculate;
    @FXML
    private TextArea txtRoots1;
    @FXML
    private TextField txtx101;
    @FXML
    private TextField txtx91;
    @FXML
    private TextField txtx81;
    @FXML
    private TextField txtx71;
    @FXML
    private TextField txtx61;
    @FXML
    private TextField txtx51;
    @FXML
    private TextField txtx41;
    @FXML
    private TextField txtx31;
    @FXML
    private TextField txtx21;
    @FXML
    private TextField txtx12;
    @FXML
    private TextField txtx111;
    @FXML
    private Label lblPolynomial1;
	@FXML
	private TextField txtMin;
	@FXML
	private TextField txtMax;
	
	String function = "";
	String finalFunction = "";
	double root = 0.0;
	int var = 0;
	
	

	public void initialize() {
		
		btCalculate.setVisible(false);
		lblP0.setVisible(false);
		lblIntervalos.setVisible(false);
		txtMin.setVisible(false);
		txtMax.setVisible(false);
		txtP0.setVisible(false);
		lblI1.setVisible(false);
		lblI2.setVisible(false);
		lblI3.setVisible(false);
	}
	

	

	public void saveFunction(ActionEvent e) {
	
		//System.out.println("Hola");
		String function = "";
		String x1 = txtx1.getText();
		String x2 = txtx2.getText();
		String x3 = txtx3.getText();
		String x4 = txtx4.getText();
		String x5 = txtx5.getText();
		String x6 = txtx6.getText();
		String x7 = txtx7.getText();
		String x8 = txtx8.getText();
		String x9 = txtx9.getText();
		String x10 = txtx10.getText();
		String x11 = txtx11.getText();
		
		if(x10.isEmpty()) {
			function += "";
		}else {
			function += x10+"x^10+"; 	
		}
		
		if(x9.isEmpty()) {
			function += "";
		}else {
			function += x9+"x^9+";
		}
		if(x8.isEmpty()) {
			function += "";
		}else {
			function += x8+"x^8+";
		}
		if(x7.isEmpty()) {
			function += "";
		}else {
			function += x7+"x^7+";
		}
		if(x6 != null) {
			function += "";
		}else {
			function += x6+"x^6+";
		}
		
		if(x5.isEmpty()) {
			function += "";
		}else {
			function += x5+"x^5+";
		}
		if(x4.isEmpty()) {
			function += "";
		}else {
			function += x4+"x^4+";
		}
		if(x3.isEmpty()) {
			function += "";
		}else {
			function += x3+"x^3+";
		}
		if(x2.isEmpty()) {
			function += "";
		}else {
			function += x2+"x^2+";
		}
		if(x1.isEmpty()) {
			function += "";
		}else {
			function += x1+"x+";
		}
		if(x11.isEmpty()) {
			function += "0";
		}else {
			function += x11;
		}
		
		if(x1.isEmpty() && x2.isEmpty() && x3.isEmpty() && x4.isEmpty() && x5.isEmpty()
				&& x6.isEmpty() && x7.isEmpty() && x8.isEmpty() && x9.isEmpty() && x10.isEmpty() && x11.isEmpty()) {
			System.out.println("No has escrito ninguna funci�n.");
		}
		
		
		
		System.out.println(function);
		lblPolynomial.setText(function);
	}
	
// A PARTIR DE AQUI USO LOS METODOS
	public void selectNewton(ActionEvent e) {
		lblP0.setVisible(true);
		txtP0.setVisible(true);
		btCalculate.setVisible(true);
		
		lblIntervalos.setVisible(false);
		lblI1.setVisible(false);
		lblI2.setVisible(false);
		lblI3.setVisible(false);
		txtMin.setVisible(false);
		txtMax.setVisible(false);
		var = 1;
	}
	
	public void selectBisection(ActionEvent e) {
		lblIntervalos.setVisible(true);
		lblI1.setVisible(true);
		lblI2.setVisible(true);
		lblI3.setVisible(true);
		txtMin.setVisible(true);
		txtMax.setVisible(true);
		btCalculate.setVisible(true);
		
		lblP0.setVisible(false);
		txtP0.setVisible(false);
		
		var = -1;
	}
	
	public void saveFunction1(ActionEvent e) {
//		String function = "";
		String x1 = txtx12.getText();
		String x2 = txtx21.getText();
		String x3 = txtx31.getText();
		String x4 = txtx41.getText();
		String x5 = txtx51.getText();
		String x6 = txtx61.getText();
		String x7 = txtx71.getText();
		String x8 = txtx81.getText();
		String x9 = txtx91.getText();
		String x10 = txtx101.getText();
		String x11 = txtx111.getText();
		
		if(x10.isEmpty()) {
			function += "";
		}else {
			function += x10+"*x^10+"; 	
		}
		
		if(x9.isEmpty()) {
			function += "";
		}else {
			function += x9+"*x^9+";
		}
		if(x8.isEmpty()) {
			function += "";
		}else {
			function += x8+"*x^8+";
		}
		if(x7.isEmpty()) {
			function += "";
		}else {
			function += x7+"*x^7+";
		}
		if(x6.isEmpty()) {
			function += "";
		}else {
			function += x6+"*x^6+";
		}
		
		if(x5.isEmpty()) {
			function += "";
		}else {
			function += x5+"*x^5+";
		}
		if(x4.isEmpty()) {
			function += "";
		}else {
			function += x4+"*x^4+";
		}
		if(x3.isEmpty()) {
			function += "";
		}else {
			function += x3+"*x^3+";
		}
		if(x2.isEmpty()) {
			function += "";
		}else {
			function += x2+"*x^2+";
		}
		if(x1.isEmpty()) {
			function += "";
		}else {
			function += x1+"*x+";
		}
		if(x11.isEmpty()) {
			function += "0";
		}else {
			function += x11;
		}
		
		if(x1.isEmpty() && x2.isEmpty() && x3.isEmpty() && x4.isEmpty() && x5.isEmpty()
				&& x6.isEmpty() && x7.isEmpty() && x8.isEmpty() && x9.isEmpty() && x10.isEmpty() && x11.isEmpty()) {
			System.out.println("No has escrito ninguna funci�n.");
		}
		
//		
//		for(int i = 0; i < function.length(); i++) {
//			if(function.charAt(i) == '+' && function.charAt(i+1) == '-') {
//				function = function.substring(i, i+1)+'-';
//				
//			}
//		}
		
		
//		lblPolynomial1.setText(function);
		System.out.println(function);
		
		if(var > 0) {
			calculateRoot_newtonMethod(e); 
		}else if(var < 0) {
			calculateRoot_bisectionMethod(e);
		}
		
		
	}
	
	public void rewriteFunction() {
		for(int i = 0; i < function.length(); i++) {
			if(function.charAt(i) == '+' && function.charAt(i+1) == '-') {

				finalFunction += function.charAt(i+1);
				i++;
				
			}else {
				finalFunction += function.charAt(i);
			}
		}
	}
	
	public void calculateRoot_newtonMethod(ActionEvent e) {
		rewriteFunction();
		lblPolynomial1.setText(finalFunction);
		System.out.println("la nueva f: "+finalFunction);
		
		int p0 = Integer.parseInt(txtP0.getText());
		root = Main.getPolynomials().newtonRaphson(finalFunction, p0);
		txtRoots1.setText(String.valueOf(root));
		
	}
	
	public void calculateRoot_bisectionMethod(ActionEvent e) {

		rewriteFunction();
		lblPolynomial1.setText(finalFunction);
		System.out.println("la nueva f: "+finalFunction);
		
		int min = Integer.parseInt(txtMin.getText());
		int max = Integer.parseInt(txtMax.getText());
		root = Main.getPolynomials().bisectionMethod(finalFunction, min, max);
		txtRoots1.setText(String.valueOf(root));
	}
}
