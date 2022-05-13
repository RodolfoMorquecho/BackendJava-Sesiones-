package semana1.Viernes;

class Bike2{  //Clase que tiene un metodo que hace que la bici empieza a andar  -  Clase padre
    void run(){        //Metodo
        System.out.println("running......");    //Describe la acción que realiza el metodo
    }
}

public class Polimorfismo extends Bike2 {  //Clase hija en la cual queremos extendre las caracteristicas de la clase Bike2
    //Como vamos a redefinir el metodo run, automaticamente nos aparece "@Override"  --> (1)
    //Automaticamente pone el "super.run()" en caso de que querramos usar el metodo exactamente como el de la clase padre --> (2)
    //En caso de que no querramos usar el metodo como viene del padre lo eliminamos y lo redefinimos   --> (3)
    @Override    // (1)
    void run() {
        //super.run();    --> Esto se queda cuando queremos dejar el metodo sin cambios  (2)
        System.out.println("running safely with 60 miles per hour");    // (3)
    }

    public static void main(String[] args) {    //Se llama a la funcion principal
        //Ligadura Dinamica -> El objeto(bici) va a ser de tipo "Bike2" pero queremos que se construya con lo que hay en "Polimorfismo"
        Bike2 bici = new Polimorfismo();  //Creamos el objeto con "Ligadura Dinamica"
        bici.run();  //Con el objeto accedemos al metodo run de la clase Polimorfismo
    }
}
