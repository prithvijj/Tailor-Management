package application;

public class Product {
	private String name;
	private String phoneNumber;
	private int numberOfChildren;
	private String color;
	private double length;
	private double neck;
	private double armLength;
	private double wristLength;
	private double waistLength;
	private double shoulder;
	private String comment;
	
	public Product (String tempName, String tempPhoneNumber, int tempNumberOfChildren, String tempColor,
			double tempLength, double tempNeck, double tempArmLength, double tempWristLength, double tempWaistLength,
			double tempShoulder, String tempComment) {
		this.name = tempName;
		this.phoneNumber = tempPhoneNumber;
		this.numberOfChildren = tempNumberOfChildren;
		this.color = tempColor;
		this.length = tempLength;
		this.neck = tempNeck;
		this.armLength = tempArmLength;
		this.wristLength = tempWristLength;
		this.waistLength = tempWaistLength;
		this.shoulder = tempShoulder;
		if (tempComment.length() == 0) {
			this.comment = "null";
		}else {
			this.comment = tempComment;
		}
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public int getNumberOfChildren() {
		return this.numberOfChildren;
	}

	public String getColor() {
		return this.color;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getNeck() {
		return this.neck;
	}
	
	public double getArmLength() {
		return this.armLength;
	}
	
	public double getWristLength() {
		return this.wristLength;
	}
	
	public double getWaistLength() {
		return this.waistLength;
	}
	
	public double getShoulder() {
		return this.shoulder;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public String toString() {
		String temp = String.format("{%s,%s,%d,%s,%f,%f,%f,%f,%f,%f,%s}", this.getName(), this.getPhoneNumber(),this.getNumberOfChildren(),this.getColor(),
				this.getLength(),this.getNeck(),this.getArmLength(),this.getWristLength(),this.getWaistLength(),this.getShoulder(),this.getComment());
		return temp;
	}
	
	
	
	
	
	
	
	
}
