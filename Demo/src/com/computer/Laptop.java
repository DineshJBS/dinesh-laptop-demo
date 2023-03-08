package com.computer;

public class Laptop {

	String laptopBrand;
	
	
	HardDrive harddrive;



	@Override
	public String toString() {
		
		return "Laptop [laptopBrand=" + laptopBrand + ", hardrive=" + harddrive+ "]";
	}

	
	Laptop(String brand, HardDrive harddrive){
		this.laptopBrand = brand;
		this.harddrive = harddrive;
	}
	
	Laptop(String brand1){
		this.laptopBrand = brand1;
	}
	

	
	
}
