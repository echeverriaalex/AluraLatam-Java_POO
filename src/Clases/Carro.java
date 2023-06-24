package Clases;

public class Carro {
	
    private int ano;
    private String modelo;
    private double precio;

    public void setAno(int año) {this.ano = año;}
    public int getAno() {return this.ano;}
    
    public void setPrecio(double precio) {this.precio = precio;}
    public double getPrecio() {return this.precio;}
    
    public void setModelo(String modelo) {this.modelo = modelo;}
    public String getModelo() {return this.modelo;}
    
    public Carro(){
    	this.setAno(0);
    	this.setModelo("");
    	this.setPrecio(0);
    }
    
    //llamando al constructor que recibe int, String y double primero!               
    public Carro(double precio,String modelo){
        this(2017, modelo, precio);
    }
    
    public Carro(double precio, int ano, String modelo){
        this.ano = ano;
        this.setModelo(modelo);
        this.precio = precio;
    }

    /*
    public Carro(String modelo, double precio){
        this.ano = 2017;
        this.setModelo(modelo);
        this.precio = precio;
    }
    */
    
    //Nuevo construtor AQUI!
    public Carro(String modelo, double precio){
        this.ano = 2017;
        if(modelo != null){
            this.setModelo(modelo);
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.setModelo("Gol");
        }
        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }
    }
    
    public Carro(String modelo,int ano, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es valido. Por eso usaremos 2017!");
            this.ano = 2017;
        }
        if( modelo != null){
            this.setModelo(modelo);
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.setModelo("Gol");
        }
        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es valido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
         }
    }
    
    public Carro(int ano, String modelo, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
            this.ano = 2017;
        }
        if( modelo != null){
            this.setModelo(modelo);
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.setModelo("Gol");
        }
        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }

    }
    
    @Override
    public String toString() {
    	return "\nModelo: " + this.getModelo() +
    			"\nAño: " + this.getAno() + 
    			"\nPrecio: " + this.getPrecio() + "\n\n";
    }
}