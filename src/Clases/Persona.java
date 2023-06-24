package Clases;

public class Persona {
 
    int edad;
    int peso;
    String nombre;
    String numeroIdentidad; 
    Direccion direccion;
    
    public Persona() {
		// TODO Auto-generated constructor stub
    	this.edad = 0;
    	this.peso = 0;
    	this.nombre = "";
    	this.numeroIdentidad = "";
    	this.direccion = new Direccion(); // para que no salte error de que esta null
	}
    

}