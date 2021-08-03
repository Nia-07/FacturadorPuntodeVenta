module FacturacionOlimpica {
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.base;
	
	
	opens view to javafx.graphics, javafx.fxml;
	opens edu.poli;
	
	

}
