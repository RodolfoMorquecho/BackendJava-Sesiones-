package semana1.Viernes;
/*
Overload: Sobrecarga (Un metodo con el mimo nombre de la clase pero diferente signatura(diferente valor de retorno), a excepcion del constructor por omision
Override: Redefine
Overwrite: Sobreescribe
 */
public class Bike {
    //Cuando usamos el "Bike()" estamos haciendo referencía al constructor por omisión
    //Despues de la llamada "b" se convierte en un apuntador a un objeto, es decir con memoria reservada para contener
    // los valores de los atributos y apuntadores a los metodos
    // Bike b = new Bike();       <---- <<EJEMPLO>> que fue descrito arriba

    private int velocidad;
    private String color, marca;

    //<<Se realiza la sobrecarga de constructores (para cubrir todos los casos) ->Overload>>
    //Caso 0
    public Bike(){  };  //Constructor por omisión, debe ir explicíto en caso de sobrecargas para poder realizar una validacion directa en el objeto
    //Caso1
    public Bike(String color){  this.color = color; } //1er Caso
    //Los 3 son ejemplos de Overload porque tienen el mismo nombre de la clase pero diferentes valores de retorno
    //Caso2
    public Bike(String color, int velocidad){  //2do Caso
        this.color = color;
        this.velocidad = velocidad;
    }
    //Caso3
    public Bike(String color, String marca, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public int getVelocidad(){  return velocidad;  }
    public  String getColor(){  return color;  }
    public  String getMarca(){  return marca;  }
}
