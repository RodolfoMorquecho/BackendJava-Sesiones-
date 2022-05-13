package semana2.Hilos;

public class TestJoin extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),    //Como son del mismo tipo(TestJoin) los hilos podemos separarlos con coma para-
                t3 = new TestJoin();    //-crear nuesvos hilos

        showDetails(t1,t2,t3);  //Estamos mandando llamar los detalles(propiedades)

        t1.start();

        try {
            t1.join(1500);  //join es como decir que por 1.5s solo se va a ejecutar ese hilo antes que los demas
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        }catch(InterruptedException ie){
            ie.printStackTrace();  //Nos da la ruta en donde haya fallado
        }

        //Terminado el try anterior los 3 hilos iran 0.5s, uno tras otro. Pero el hilo 1 ya habra avanazado 3 ciclos
        //de 0.5s osea, ya ira con el contador 3. mientras que los hilos 2 y 3 apenas estaran en 1
        t2.start();
        t3.start();
    }

    //Metodo para mostrar las propiedades de los hilos con los callbacks que tiene Thread para dar esos detalles
    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo 1: "+t1.getName()+" id: "+t1.getId()+" estado: "+t1.getState()+" prioridad: "+t1.getPriority());
        System.out.println("Hilo 2: "+t2.getName()+" id: "+t2.getId()+" estado: "+t2.getState()+" prioridad: "+t2.getPriority());
        System.out.println("Hilo 3: "+t3.getName()+" id: "+t3.getId()+" estado: "+t3.getState()+" prioridad: "+t3.getPriority());
    }
}
