package Clases;

public class Alumno {
	private String nombre;
    private String matricula;
    
    public Alumno() {
    	this.setMatricula("");
    	this.setNombre("");
    }
    
    public Alumno(String nombre, String matricula) {
    	this.setMatricula(nombre);
    	this.setNombre(matricula);
    }
    
    public String getNombre(){
	   return this.nombre;
	}

	public String getMatricula(){
	   return this.matricula;
	}

	public void setMatricula(String matricula){
	   this.matricula = matricula;
	}

	public void setNombre(String nombre){
	   this.nombre = nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNombre: " + this.getNombre() +
				"\nMatricula: " + this.getMatricula();
	}
}