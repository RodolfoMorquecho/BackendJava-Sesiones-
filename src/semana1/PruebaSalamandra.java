package semana1;

public class PruebaSalamandra {
    //Clase principal la cual no retorna nada pero va a recibir cosas
    public static void main(String[] args) {
        definicion();
    }

    public static void definicion(){
        Salamandra salamTigre = new Salamandra();  // -> Para crear objetos siempre deben estar dentro del metodo <-
        salamTigre.setLargo(20);
        salamTigre.setPatas(4);
        salamTigre.setColor("Negra con manchas color amarillo olivo");
        salamTigre.setPiel("Lisa y brillante");
        salamTigre.setOjos("Parecen dos lunas nuevas");
        //Hasta aqui estan definidos pero no se muestran en pantalla

        //Empezamos a asignarlos a un String msg para despues ser mostrados en pantalla con System.out.print(msg)
        String msg = "Soy una Salamandra tigre y estas son algunas de mis particularidades: ";
        msg += "\nLargo: "+salamTigre.getLargo();
        msg += "\nPatas: "+salamTigre.getPatas();
        msg += "\nColor: "+salamTigre.getColor();
        msg += "\nPiel: "+salamTigre.getPiel();
        msg += "\nOjos: "+salamTigre.getOjos();

        System.out.print(msg);
    }
}
