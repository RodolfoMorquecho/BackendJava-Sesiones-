package semana1.Viernes;

public class MountainBike {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        //En este ejemplo se toma el caso 2 de constructor
        Bike b = new Bike("Azul", 8);  //Se realiza la validación directa en el objeto(b)
        System.out.println(b.getColor());    //Se imprime el atributo "color" del objeto "b"
        System.out.println(b.getVelocidad());
    }
}
