package semana1.Viernes;

class Animal2 {
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal {
    void eat(){
        System.out.println("Tomando agua");
    }
}

public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal princesita;    //Creamos un "objeto" de tipo Animal llamado princesita
        princesita = new Animal();  //Le asignamos sus metodos y variables modelados (Es una nueva instancia de Animal)
        princesita.eat();
        princesita = new Dog();  //Cuando lo construye con Dog() nos aparece que se crea un animalito ya que la clase extiende de Animal se trae el constructor por default
        princesita.eat();  //Imprime el metodo eat() que hay dentro de la class Dog
        princesita = new Cachorro();
        princesita.eat();  //No se pone super porque no extiende de la clase animal, es un objeto y atraves del objeto me puedo comunicar
    }
}
