package com.tutorial;

public class DataMahasiswa {
	// States
		// Merek
	String merek;
	
		// Prosessor
	String core;
	
		//RAM
	int ram;
	
		// Getter
	public String getMerek() {
		return merek;
	}
	public void setMerek(String merek) {
		this.merek = merek;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	// Methods
	void SpesifikasiLaptop() {
		System.out.println("=== Spesifikasi Laptop ===");
		System.out.println("Merek	:" + merek);
		System.out.println("Prosessor	:" + core);
		System.out.println("Ram	:"+ ram);
	}

}