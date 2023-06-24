package Clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona heroe = new Persona();
		heroe.nombre =  "Jonny";
		
		Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 500.0;
        
        // otraCuenta es puntero de cuenta, ambas apuntan a la misma direccion de memoria
        // si modifico otraCuenta tambien se modifica cuenta 
        Cuenta otraCuenta = miCuenta; 
        System.out.println("\nMi cuenta: " + miCuenta.saldo);
        otraCuenta.saldo += 1000.0;
        System.out.println("\nMi cuenta: " + miCuenta.saldo);	   
        System.out.println("\nOtra cuenta: " + otraCuenta.saldo);	  
	
        Cuenta primeraCuenta = new Cuenta ();
        primeraCuenta.saldo = 200;
        System.out.println("\nPrimera cuenta: " + primeraCuenta.saldo);
        primeraCuenta.saldo += 100;
        System.out.println("\nPrimera cuenta: " + primeraCuenta.saldo);
        primeraCuenta.saldo = 200;
        System.out.println("\nPrimera cuenta: " + primeraCuenta.saldo);
        primeraCuenta.saldo += 100;
        System.out.println("\nPrimera cuenta: " + primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 50;
        System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
        System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Alex Nahuel Echeverria");
        alumno1.setMatricula("ANE 12345");
        System.out.println(alumno1.toString());
        
       
        
        Persona p = new Persona();
        p.nombre = "Paulo";
        p.direccion.calle = "Avenida XYZ";
        p.direccion = new Direccion();
        p.direccion.calle  = "Aveninda XYZ";
        
        
        
        Cuenta cuentaDeMarcela = new Cuenta();
        cuentaDeMarcela.titular = new Cliente(); 
        //Podemos definir el nombre de un cliente haciendo:
        cuentaDeMarcela.titular.nombre = "Marcela";
        
        Cliente cliente = new Cliente();
        cliente.nombre = "José";
        //cliente.numeroIdentidad = "12312312312";
        cliente.edad = 49;        
        System.out.println(cliente.toString());
        
        Cuenta cuenta = new Cuenta();
        //cuenta.setTitular("Fábio");
        cuenta.setSaldo(100.0);      

        double valorSaque = 50.0;

        if(cuenta.getSaldo() >= valorSaque){
            double nuevoSaldo = cuenta.getSaldo() - valorSaque;
            cuenta.setSaldo(nuevoSaldo);
        }
       

        // ¡Funcionó! Pero un problema es que esta lógica de restringir el retiro al monto del saldo deberá rehacerse cada vez que se necesite una operación de retiro en nuestra cuenta. Además del problema de duplicación de esta sección, un problema para la encapsulación es que quien realmente controla las reglas de saldo de la cuenta es quién está usando la cuenta. En otras palabras, nada impide que alguien implemente un límite adicional para esto y tenga una regla completamente diferente de otros objetos de tipo Cuenta:

        if(cuenta.getSaldo() + 1000.0 >= valorSaque){
            double nuevoSaldo = cuenta.getSaldo() - valorSaque;
            cuenta.setSaldo(nuevoSaldo);
        }


        // Cuando creamos clases que se limitan a tener atributos privados con setters y getters, generalmente decimos que son clases que solo cargan valor, por lo que comúnmente se llaman clases de títeres o `Value Objects`.
        // ¡Una clase de títeres es una que no tiene responsabilidad, aparte de llevar un puñado de atributos! ¡Esto definitivamente no está orientado a objetos! Este modelo, aunque a veces se usa, no debería ser una práctica común al desarrollar el dominio de nuestro proyecto con el riesgo de caer en el `modelo anémico`, que es exactamente lo que la `Cuenta` es hoy. Una clase donde los datos y los comportamientos / lógica no están juntos.
        // Volviendo a nuestro ejemplo de la Cuenta, está claro que en el mundo real las operaciones podrían representarse con métodos como `saca()` y `deposita()` en lugar de simplemente establecer `SetSaldo()`:
        //Tenga en cuenta que la lógica de saque y depósito está representada dentro de la clase y, además, nuestro `setSaldo()` ya no tiene sentido para el usuario de la Cuenta. La forma de interactuar con el saldo es siempre a través de una de las operaciones anteriores:


        Carro carro1 = new Carro();
        carro1.setAno(2013);
        carro1.setPrecio(35000.0);        
        System.out.println(carro1.toString());
        
        Carro carro2 = new Carro(2013, "Gol", 35000.0);
        System.out.println(carro2.toString());
        
        Carro carro3 = new Carro("Civic", 95000.0);
        System.out.println(carro3.toString());
        
        Cuenta cuenta1 = new Cuenta(123,456);
        cuenta1.setTitular(cliente);
        System.out.println(cuenta1.toString());
 
	}
}
