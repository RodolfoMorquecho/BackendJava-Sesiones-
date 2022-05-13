package semana2;

abstract class Hola{
    void saludar(){
        System.out.println("¿Como estas?, Te vez bien eh");
    }
    abstract void saludo();
}

interface Mostrar{  //Nos sirve para definir el "que hace"
    //Podemos o no poner el abstract antes del metodo no afectara, solo aplica para la "interface"
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar {  //En clase SaludosCordiales vamos a implementar los metodos de Mostrar
    public void show(){
        System.out.println("Hola, ¿Como estas?, espero no del todo mal...");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();  //Creamos objeto para acceder a un metodo implementado de SaludosCordiales
        saludo1.show();
    }

    public void despide(){  //El metodo que faltaba implementarse
        System.out.println("Gracias, no...");
    }
}
