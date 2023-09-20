package zooAnimales;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	int iguanas;
	int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
		
	}
	
	public Reptil() {
		super();
		Reptil.listado.add(this);
		
	}
	
	public void setListado(ArrayList<Repttil> listado) {
		this.listado = listado;
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
	
	public ArrayList<Repttil> getListado() {
		return listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes++;
		return serpiente;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
}






