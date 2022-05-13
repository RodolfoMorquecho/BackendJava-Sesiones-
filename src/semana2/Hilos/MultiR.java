package semana2.Hilos;

//Ejemplo donde creamos un objeto desde la interface y de inmediato e implementamos run()

public class MultiR {  //Observacion: No lleva nada como implements o extends
    public static void main(String[] args) {
        //La interface Runnable tiene el metodo abstracto run()
        Runnable r1 = new Runnable() {  //Creamos el objeto desde la misma interface
            @Override
            public void run() {    //Implementación la cual no esta siendo dentro de la interface, es desde el metodo run()
                System.out.println("Task one");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task two");
            }
        };

        Thread t1 = new Thread(r1),
                t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
