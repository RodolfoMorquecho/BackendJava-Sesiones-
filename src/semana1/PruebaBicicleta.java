package semana1;

import java.sql.SQLOutput;

public class PruebaBicicleta {
    //Clase principal la cual no retorna nada pero va a recibir cosas
    public static void main(String[] args) {
        def();        //Se manda llamar el metodo en la clase principal
    }
    //¿Como conectar lo que hay en Bicicleta con PruebaBicicleta?

            //Bicicleta hace referencía a la "clase Bicicleta" (Se debe llamar exactamente igual)
            //biciMountain es el nombre que se le puso al nuevo objeto que se creo
            //"new Bicicleta()" es para crear una nueva instancia de la clase Bicicleta

              //el () parentesis quiere decir que se esta usando el constructor por omision
              //El constructor por omision sirve para inicializar

    //public:nivel de acceso || static:para poder mandarlo llamar en main que tambien es static || void:valor de retorno vacio
    public static void def(){         //def es el nombre del metodo el cual no tendra parametros
        Bicicleta biciMountain = new Bicicleta();    // -> Para crear objetos siempre deben estar dentro del metodo <-
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        //Hasta aqui estan definidos pero no se muestran en pantalla

        //Empezamos a mostrarlos mediante String msg
        String msg = "Soy una bicicleta de montaña con estas caracteristicas: ";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();    //El msg += va sumando todos los mensajes
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nRodada: "+biciMountain.getRodada();

        //Sirve para sacar mensaje en pantalla     - con println me da los saltos de linea por automatico
        System.out.print(msg);

        //Programa terminado y funcionando  Min 2:19:02
    }

}
