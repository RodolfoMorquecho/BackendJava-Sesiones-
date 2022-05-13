public class Game {
    public static void main(String[] args) throws InterruptedException {

        TestAshe();  //Llamamos a la funcion "TestAshe" dentro de la principal
    }

    private static void TestAshe() throws InterruptedException {
        //Creamos un objeto de tipo "Screen" para trabajar con la interface grafica
        Screen screen = new Screen();

        //         Construccion del Objeto
        //Creamos un objeto de tipo "Ashe" al cual le asignamos valores a los campos
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte"
        );

        //Implementamos la interface Runnable de manera anonima
        //Le indicamos que ejecute todas las acciones dentro de ella(metodos)
        Runnable atack = new Runnable() {
            @Override
            public void run() {
                try {
                    //       Llamamos cada uno de sus ataques(habilidades)
                    ashe.frostShot(screen);  //Al llamar un ataque ya tiene implicita la info, porque tiene implementados los datos en showMessage
                    Thread.sleep(4000);  //Le damos una espera de 4seg con el metodo de sleep de Thread(Hilos)

                    ashe.crystalArrow(screen);  //Pasamos el objeto screen de la clase "Screen" para que se trabaje sobre la interface grafica
                    Thread.sleep(4000);

                    ashe.volley(screen);
                    Thread.sleep(4000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(4000);

                    ashe.hawkShot(screen);
                    Thread.sleep(4000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread attackAshe = new Thread(atack);  //Creamos un hilo de la interface "atack" la cual pasamos como parametro
        attackAshe.start();  //La ponemos en start para que vaya a run y ejecute el metodo
    }
}