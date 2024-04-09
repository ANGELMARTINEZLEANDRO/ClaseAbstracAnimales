package Model;

public abstract class Animales {
	//ATRIBUTOS
	String nombre;
	String habitad;
	
	public Animales(String nombre, String habitad) {
		this.nombre = nombre;
		this.habitad = habitad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	
	

}
