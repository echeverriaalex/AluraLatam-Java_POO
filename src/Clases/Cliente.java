package Clases;

public class Cliente {
	
	String nombre;
	private String numeroIdentidad;
    String profesion;
    int edad;
    
    public Cliente() {
		// TODO Auto-generated constructor stub
    	this.setNombre("");
    	this.setNumeroIdentidad("");
    	this.setProfesion("");
    	this.setEdad(0);
	}
    
    public Cliente(String nombre, String numeroIdentidad, String profesion, int edad) {
    	this.setNombre(nombre);
    	this.setNumeroIdentidad(numeroIdentidad);
    	this.setProfesion(profesion);
    	this.setEdad(edad);
	}
    
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getProfesion() {
		return profesion;
	}
	
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNombre: " + this.getNombre() + 
				"\nEdad: " + this.getEdad() + 				
				"\nProfesion: " + this.getProfesion() + 
				"\nNumero identidad: " +this.getNumeroIdentidad() + "\n";
	}
}