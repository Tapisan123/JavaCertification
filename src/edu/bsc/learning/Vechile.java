package edu.bsc.learning;

public class Vechile {
	
	String make;
	String model;
	int horsePower;
	
	@Override
	public String toString() {
		return "Vechile [make=" + make + ", model=" + model + ", horsePower=" + horsePower + "]";
	}
	
	
	public Vechile(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		this.horsePower = horsePower;
	}


	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

}
