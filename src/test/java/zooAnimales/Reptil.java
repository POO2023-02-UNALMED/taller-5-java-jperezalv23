package zooAnimales;

public class Reptil extends Animal {
	private Reptil[] listado;
	int iguanas;
	int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
	}
	
	public Reptil() {
		
	}
	
	public void setListado(Reptil[] listado) {
		this.listado = listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public Reptil[] getListado() {
		return listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
}
