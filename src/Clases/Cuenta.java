package Clases;

public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    //String titular;
    Cliente titular;
    private static int total = 0;
    
    public Cuenta(){
        System.out.println("creando una cuenta");
    }
    
    public Cuenta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; // esto significa que cada cuenta comienza con un saldo de 100.
        System.out.println("Estoy creando una cuenta");
    }
    
    public static int getTotal(){
        return Cuenta.total;
    }
    
    /*
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }
    */
    
    public boolean saca(double valor){
        if(this.saldo >= valor && valor > 0){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
     
    public void deposita(double valor){
    	if(valor>0){
    		this.saldo += valor;
        }
    }
    
    public double getSaldo(){
    	return this.saldo;
    }
    
    public boolean transfiere(double valor, Cuenta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
        }
        return false;
    }
    
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    
    
    
    
    
    
    
    
    
    
    public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	@Override
    public String toString() {
    	return "\nTitular" + this.getTitular().toString() +
    			"\nSaldo: " + this.getSaldo() + "\n\n";
    			// "\nTotal: " + this.getTotal();
    }
    
}