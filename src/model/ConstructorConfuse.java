package model;

public class ConstructorConfuse {
	
	private int dogumYiliRakamIle;
	private String dogumYiliYaziIle;
	
	
	
	
	
	public ConstructorConfuse(int dogumYiliRakamIle) {
		super();
		this.dogumYiliRakamIle = dogumYiliRakamIle;
	}

	



	public ConstructorConfuse(String dogumYiliYaziIle) {
		super();
		this.dogumYiliYaziIle = dogumYiliYaziIle;
	}





	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Benim Dogum Y�l�m:[rakam ile:"+dogumYiliRakamIle+" yaz� ile:"+dogumYiliYaziIle+"]";
	}
	

}
