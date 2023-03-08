package com.computer;

public class MainDemo {

	public static void main(String[] args) {

		// hard drive object with size 
		HardDrive hardrive = new HardDrive(5);
		
		
		// hardrive object with brand and size 
		HardDrive hardrive1 = new HardDrive("Hitachi",5);
		
		// laptop object with brand
		Laptop laptop = new Laptop("Lenovo");
		
		// laptop object with both brand and harddrive object
		Laptop laptop2 = new Laptop("Lenovo", hardrive1);
		
		System.out.println(laptop.toString());
	
		System.out.println(hardrive1.toString());
		
		// printing laptop and hardDrive
		System.out.println(laptop2.toString());
	}

}
