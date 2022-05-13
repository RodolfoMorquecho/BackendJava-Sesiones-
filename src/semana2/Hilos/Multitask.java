package semana2.Hilos;

public class Multitask extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea uno");
    }
/*
    public static void main(String[] args) {
        Multitask t1 = new Multitask(),
                t2 = new Multitask(),
                t3 = new Multitask();

        t1.start();
        t2.start();
        t3.start();
    } */
}

//Crear hilo de otra forma(ya lo vimos en ejemplos anteriores)
class Multitasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Terea uno Runnable");
    }

    public static void main(String[] args) {
        //Los dos hilos ejecutan lo mismo
        Thread t1 = new Thread(new Multitasking());  //Creamos un hilo atraves de un objeto anonimo del tipo Multitasking - Multitasking ejecuta el metodo run
        Thread t2 = new Thread(new Multitasking());  //Cuando ponemos el tipo directo(Multitasking) no tenemos que definirlo

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        t1.start();
        t2.start();

        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A");
    }
}
class  Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B");
    }
}