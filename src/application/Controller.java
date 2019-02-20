package application;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
	
	@FXML private TableView<Product> productView;
	@FXML private TableColumn<Product,String> nameCol;
	@FXML private TableColumn<Product, String> phoneNumberCol;
	@FXML private TableColumn<Product, Integer> numberOfChildrenCol;
	@FXML private TableColumn<Product, String> colorCol;
	@FXML private TableColumn<Product,Double> lengthCol;
	@FXML private TableColumn<Product,Double> neckCol;
	@FXML private TableColumn<Product,Double> armLengthCol;
	@FXML private TableColumn<Product,Double> wristLengthCol;
	@FXML private TableColumn<Product,Double> waistLengthCol;
	@FXML private TableColumn<Product,Double> shoulderCol;
	@FXML private TableColumn<Product,String> commentCol;
	
	
	// Initialize Controller
	@FXML
	public void initialize() throws FileNotFoundException {
		//Setting up the Column
		System.out.println("hello");
		nameCol.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		phoneNumberCol.setCellValueFactory(new PropertyValueFactory<Product, String>("phoneNumber"));
		numberOfChildrenCol.setCellValueFactory(new PropertyValueFactory<Product, Integer>("numberOfChildren"));
		colorCol.setCellValueFactory(new PropertyValueFactory<Product, String>("color"));
		lengthCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("length"));
		neckCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("neck"));
		armLengthCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("armLength"));
		wristLengthCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("wristLength"));
		waistLengthCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("waistLength"));
		shoulderCol.setCellValueFactory(new PropertyValueFactory<Product, Double>("shoulder"));
		commentCol.setCellValueFactory(new PropertyValueFactory<Product, String>("comment"));
		
		//Load data
		productView.getItems().addAll(getObservableList());
		//productView.setItems(getObservableList());
		
		
	}
	
	
	
	
	private ObservableList<Product> getObservableList() throws FileNotFoundException{
		ArrayList<Product> productArray = Parser.parser();
		
		ObservableList<Product> productObservable = FXCollections.observableArrayList();
		
		for (Product element : productArray) {
			System.out.println(element);
			productObservable.add(element);
		}
				
		return productObservable;
		
	}
	
	
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
