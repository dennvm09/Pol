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
	
	public void initialize() {}
	
	
	
	
	@FXML
	public void showFunction(ActionEvent e) {
		System.out.println("Hola");
		saveFunction(e);
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
			System.out.println("No has escrito ninguna función.");
		}
		
		System.out.println(function);
		
		lblPolynomial.setText(function);
		
	}
	
	
	
	
}
