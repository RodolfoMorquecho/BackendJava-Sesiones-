package semana1.Viernes;

/*
Herencia Simple: De Empleado a Programadora
Herencia Multinivel: De Empleado a -> Programadora a -> Web
Herenecia Jerarquica: De Empleado a -> Programadora  ó  De Empleado a -> Web
 */

public class Empleado {  //Clase padre o super clase
    double salario = 40000;  //propiedad de clase padre
}

class Programadora extends Empleado{  //Clase hija ya que con extends le hereda propiedades la clase Empleado
    int bono = 1000;  //Propiedad o variable de la clase hija "Programadora"

    public void main(){    //Redefinimos el metodo main() --> Ejemplo e3 polimorfismo real
        Programadora fer = new Programadora();  //Se crea un objeto de la clase hija "Programadora"
        System.out.println("El salario de la programadora es: "+
                fer.salario);
        System.out.println("El bono de la programadora es: "+
                fer.bono);    //Se imprimen las propiedades desde la clase hija, ya que heredo lo del padre y podemos
                              //acceder desde ella a todas las propiedades o variables
    }

    void mensaje(){    //metodo mensaje
        System.out.println("Soy programadora");  //Se imprime un mensaje antes de mandar llamar al metodo main
        main();  //Se llama al metodo main ya que tiene acumulado todos los datos que necesitamos y son mostrados
                 //despues del mensaje anterior
    }
}

class Web extends Programadora{    //Se crea una clase la cual va a heredar lo de sus 2 clases anteriorres
    public static void main(String[] args) {    //PSVM para poder llamar nuestros metodos a la clase principal
        Web w = new Web();    //Se crea un objeto de la clase Web para poder acceder al contenido entero de sus clases padre
        w.mensaje();    //Con el objeto creado de la clase Web llamamos al metodo mensaje que almacena todos nuestra información
    }
}