package com.computer;

public class HardDrive {
	
	String brand;
	int size;
	
	HardDrive(String brand, int size){
		this.brand = brand;
		this.size = size;
	}
	
	HardDrive(){}
	
	HardDrive(String brand){
		this.brand = brand;
	}
	
	HardDrive(int size){
		this.size = size;
	}

	@Override
	public String toString() {
		return "HardDrive [brand=" + brand + ", size=" + size + "]";
	}
	
}
