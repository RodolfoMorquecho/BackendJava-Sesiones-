package semana2.Hilos;

//Ejemplo de la primera forma como podemos crear un hilo y su función
public class TestS extends Thread{  //Clase TestS que hereda todos los metodos y atributos de la classe Thread
    @Override
    public void run() {  //metodo run, Es el como lo hara
        for (int i=1; i<=10; i++){    //Va del 1 al 10 de uno en uno
            try {                          //Queremos que intente realizar las instrucciones dentro
                Thread.sleep(500);  //Accedemos al metodo sleep de la clae Thread para que nuestra instruccion tarde 0.5s
                System.out.println(i);  //Imprimira del 1 al 10 cada medio segundo
            }catch (InterruptedException ie){  //Se encarga si se llega a interrumpir por alguna razon
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestS h1 = new TestS();  //Creamos una instancía con su constructor por default
        h1.start();  //Iniciamos nuestro h1(hilo)

        HilosS h2 = new HilosS();
        Thread hr2 = new Thread(h2);
        hr2.start();
    }
}

//Ejemplo de la segunda forma como podemos crear un hilo y su función
class HilosS implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException ie){  //Captura la excepción de alguna falla
                ie.printStackTrace();
            }
        }
    }
}