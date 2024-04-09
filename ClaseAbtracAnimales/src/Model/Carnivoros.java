package Model;

public class Carnivoros extends Animales{
	float peso;
	String comida;
	String categoria;


	public Carnivoros(String nombre, String habitad) {
		super(nombre, habitad);
		// TODO Auto-generated constructor stub
	}

	// al agregar este constructor con parametros lleva el super
	public Carnivoros(String nombre, String habitad, float peso, String comida, String categoria) {
		super(nombre, habitad);
		this.peso = peso;
		this.comida = comida;
		this.categoria = categoria;
	}
	// al generar el tostring sellecionar los atributos de la super clase y subirlos 

	@Override
	public String toString() {
		return "Carnivoros [nombre=" + nombre + ", habitad=" + habitad + ", peso=" + peso + ", comida=" + comida
				+ ", categoria=" + categoria + "]\n";
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
