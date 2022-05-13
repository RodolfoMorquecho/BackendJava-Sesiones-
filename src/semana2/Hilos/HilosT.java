package semana2.Hilos;

public class HilosT extends  Thread{  //Hereda todos los metodos que nos otorga la clase Thread la cual es reservada de Java
    //Thread viene de la interface Runnable y con ello podemos acceder al metodo run()

    @Override  //Entra a Runnable
    public void run() {    //Se establece la accion que queremos que realice el hilo
        System.out.println("El hilo se esta ejecutando");
    }

    /*
    public void start(){
        //Inicia la ejecucion de un hilo
        //La Java Virtual Machine llama al metodo run del hilo
    }

    sleep - detiene de manera temporal el número especificado
    join() - Espera a que el hilo se muera para entrar
    getPriority - Regresa la prioridad del hilo
    setPriority - Establece la prioridad del hilo
    getName - Da el nombre del hilo, en caso de no haberle puesto nombre nos da uno generico
    currentThread - Referencía al hilo que se esta ejecutando
    getId - Regresa el id del hilo
    Thread.State getState - Regresa el estado actual del hilo (new,Runnable,Running,blocked)
    isAlive - Si esta vivo



    //Primera forma para llamar hilos o utilizar hilos  (en caso de correr esta forma dejar comentada la segunda forma)
    public static void main(String[] args) {
        HilosT hilo = new HilosT();  //Empieza el ciclo de vida del hilo con "new" - Entra al primer estado
        hilo.start();  //Con start puedo inicializar mi hilo, cuando esta en start es porque ya esta esperando la ejecución
                       //Cuando se pone start llama automaticamente al metodo run()
    }
    */
}

//Segunda forma para llamar hilos (en caso de correr esta forma dejar comentada la primera forma)
class HilosR implements Runnable {  //Implementa la interface Runnable "el que hace"
    //El que hace eta en la interface Runnable
    //El como lo hace lo tiene la clase Thread
    @Override
    public void run() {  //Definimos el comportamiento del hilo
        System.out.println("El hilo de Runnable esta corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();  //Creamos un objeto que ya trae el metodo run() debido a que clase HilosR implementa lo de la interface Runnable
        //Pero necesitamos pasarle las propiedades de la clase Thread, porque con Thread podemos ejecutar el metodo run()
        //Runnable tiene el metodo run() pero con Thread tenemos start y lo podria ejecutar pero fuera del ciclo de vida, lo cual no es correcto
        Thread t = new Thread(h);  //Creamos un nuevo hilo a partir del comportamiento que se defina, "h" toma los comportamientos de Thread
        t.start();  //Lo iniciamos

        // 1) Se crea un objeto que ya sabe como se va a comportar debido al metodo run()
        // 2) Ya que sabe como se comporta ahora lo convertimos en un hilo
        // 3) Lo iniciamos
    }
}