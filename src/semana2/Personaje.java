package semana2;

// Tema: Clase Abstracta  -  Es abstracta al 100%

abstract class Sombra{    //Creamos una clase abstracta para unicamente definir los metodos llamada "Sombra"
    abstract void dibujarSombra();    //Metodo definido sin tarea alguna por el momento (¿Que hace?)
}

class Arma extends Sombra{  //Creamos clase "Arma" a la cual le vamos a heredar el metodo de la clase "Sombra" con extends
    void dibujarSombra(){    //Este sera nuestro metodo heredado de la clase padre, listo para ser implementado
        System.out.println("Dibujando sombra en el arma de color azul");  //Se implementa el metodo(¿Como lo hace?)
    }
}

public class Personaje extends Arma{  //Clase "Personaje" en la cual crearemos los objetos para darle funcionamiento a nuestros metodos implementados
    public static void main(String[] args) {
        //Se hace uso de la "Ligadura Dinamica" ya que son objetos de un tipo pero van hacer uso de lo que hay en otra clase
        //Personaje le va a decir como lo dibuje ya que extiende lo que hay en clase "Arma"
        Sombra flecha = new Personaje();  //flecha se creara con el metodo de Personaje, el cual esta redefinido mas abajo
        Sombra arco = new Arma();  //arco se creara con el metodo que se encuentra en la clase "Arma"

        flecha.dibujarSombra();  //Nuestro objeto flecha accede al metodo dibujarSombra() que tiene acceso
        arco.dibujarSombra();  //Nuestro objeto arco accede al metodo dibujarSombra() que tiene acceso
    }

    @Override
    void dibujarSombra() {  //Tenemos el mismo metodo pero lo vamos a redefinir aqui en la clase personaje
        System.out.println("Dibujando sombra en el arma de color blanca");  //Implementado con distintas instrucciones
    }
}
