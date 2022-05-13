package semana2;

//Tema: Clase abstracta  -  No es abstracta al 100% ya que se implementa un metodo dentro de la clase abstracta

abstract class Mountain{  //Se crea una clase abstracta
    Mountain(){    //Se crea un constructor que al momento de que se cree un objeto del tipo Mountain lanzara el mensaje dentro
        System.out.println("Se ha creado una bicicleta de montaña");
    }
    abstract void cambiarVelocidad();  //Metodo unicamente definido (Sin implementar) es lo recomendable
    void cambiarColor(){    //Metodo definido e implementado al mismo tiempo (no es lo mas recomendable)
        System.out.println("Cambiando color a rojo");
    }
}

class Magistroni extends Mountain{  //Clase hijo que hereda los metodos de la padre para implementar lo que falta
    @Override
    void cambiarVelocidad() {  //Se implementa el metodo
        System.out.println("Se deben modificar la perillas del manubrio primero");
    }
}

public class Bicicleta extends Mountain {  //Se crea clase Bicicleta en la cual se implementa con diferentes instrucciones el metodo
    void cambiarVelocidad(){
        System.out.println("Gira las perillas");  //Implementa con distintas instrucciones
    }

    public static void main(String[] args) {
        Mountain bici = new Magistroni();  //Se crea un objeto con "Ligadura dinamica" para acceder a la implementacion de "Magistroni"
        //Mountain bici2 = new Bicicleta();

        bici.cambiarVelocidad();  //El objeto accede al metodo implementado mediante el simbilo de indireccion "."
        bici.cambiarColor();

        //bici2.cambiarVelocidad();
    }
}
