package model;

public class Computer {
	private String marka;
	private String fiyat;
	private Keyboard keyboard;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String marka, String fiyat, Keyboard keyboard) {
		super();
		this.marka = marka;
		this.fiyat = fiyat;
		this.keyboard = keyboard;
	}
	
	
	@Override
	public String toString() {
		return "Computer [marka=" + marka + ", fiyat=" + fiyat + ", keyboard=" + keyboard + "]";
	}
	
	
	
}
