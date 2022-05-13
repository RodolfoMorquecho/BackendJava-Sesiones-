package semana1.Viernes;
//   << Herencia >>

class Persona {  //Se crea clase persona - Clase Padre (Modelado de objeto principal)
    int id;
    String nombre;

    Persona(int id, String nombre){  //Se crea un constructor de la clase persona
        this.id = id;    //Se asigna el id desde teclado a la propiedad modelada en la clase
        this.nombre = nombre;
    }
}

public class Emp extends Persona{
    double salario;

    Emp(int id, String nombre, double salario){  //Constructor de la clase Emp donde esperean propiedades heredadas de clase Persona
        super(id,nombre);    //Se hace referencia con super para decir que los valores que se pasan provienen de la clase padre
        this.salario = salario;  //Se asigna el salario mediante teclado a la propiedad modelada ya que es la unica que falta
    }

    void display(){  //Se crea un metodo el cual nos sirve como informativo o descriptivo de nuestro codigo
        System.out.println(id+" "+nombre+" "+salario);
    }
}

//Probaremos nuestro metodo display en una clase distinta que tenga psvm (main)

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Emp e = new Emp(2,"Daniel", 28424.82);  //Se crea un objeto de Emp(empleado) y se le asignan valores
        e.display();  //Los valores del objeto se los pasa al metodo display()
    }
}