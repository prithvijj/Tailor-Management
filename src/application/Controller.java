package application;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	
	@FXML private TextField nameField;
	@FXML private TextField phoneNumberField;
	@FXML private TextField numberOfChildrenField;
	@FXML private TextField colorField;
	@FXML private TextField lengthField;
	@FXML private TextField neckField;
	@FXML private TextField armLengthField;
	@FXML private TextField wristLengthField;
	@FXML private TextField waistLengthField;
	@FXML private TextField shoulderField;
	@FXML private TextField commentField;
	
	
	
	@FXML
	private void addButtonClicked() {
		String tempName = nameField.getText();
		String tempPhoneNumber = phoneNumberField.getText();
		int tempNumberOfChildren = Integer.parseInt(numberOfChildrenField.getText());
		String tempColor = colorField.getText();
		double tempLength = Double.parseDouble(lengthField.getText());
		double tempNeck = Double.parseDouble(neckField.getText());
		double tempArmLength = Double.parseDouble(armLengthField.getText());
		double tempWristLength = Double.parseDouble(wristLengthField.getText());
		double tempWaistLength = Double.parseDouble(waistLengthField.getText());
		double tempShoulder = Double.parseDouble(shoulderField.getText());
		String tempComment = commentField.getText();
		Product product0 = new Product(tempName, tempPhoneNumber, tempNumberOfChildren, tempColor, 
				tempLength, tempNeck, tempArmLength, tempWristLength, tempWaistLength, tempShoulder, tempComment);
		
		System.out.println("Created Product...");
		System.out.println(product0);
		
		
		nameField.clear();
		phoneNumberField.clear();
		numberOfChildrenField.clear();
		colorField.clear();
		lengthField.clear();
		neckField.clear();
		armLengthField.clear();
		wristLengthField.clear();
		waistLengthField.clear();
		shoulderField.clear();
		commentField.clear();
		
		
		//System.out.println(nameField.getText());
		//System.out.println(phoneNumberField.getText());
		
		//System.out.println("Button has Been Clicked...");
	}

}
