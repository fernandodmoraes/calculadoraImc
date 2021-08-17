package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class SampleController {
	
	public Label Altura;
	public Label Peso;
	public Button IMC;
	public TextField impAltura;
	public TextField impPeso;
	public Label lblResult;
		
public void clicImc() {
	float peso = Float.parseFloat(impPeso.getText());
	float altura = Float.parseFloat(impAltura.getText());
	float imc = (peso / (altura * altura)) * 10000;
	lblResult.setText("Resultado: " + imc);
	System.out.println(imc);
	
	String classeImc = "Obesidade";
	if (imc < 18.5) {
		classeImc = "Magreza";
	}
	else if (imc >= 18.5 && imc <= 24.9) {
		classeImc  = "Peso Normal";
	}
	else if (imc > 24.9 && imc <30.0) {
		classeImc  = "Sobrepeso";
	}
	
	Alert alerta = new Alert(AlertType.INFORMATION);
	alerta.setTitle("Seu IMC");
	alerta.setContentText("indicativo: " + classeImc);
	alerta.show();
 }
}	
