package semana1.Viernes;

//Ejemplo para ver como podemos utilizar Super

class Animal{  //Clase padre
    //Caso1
    String color = "Blanco";  //Atributo de clase padre

    //Caso2
    void eat(){
        System.out.println("Comiendo...");
    }

    //Caso3
    Animal(){    //Se crea un constructor, lo detectamos porque tiene el mismo nombre de la clase
        System.out.println("Se crea un animalito");
    }
}

class Perro extends Animal{  //Clase hija(Perro) extiende los atributos de la clase padre(Animal)
    //Caso1
    String color = "Negro";  //Atributo de la clase "Perro" - Se redefine la variable(Color)
    void printColor(){    //Metodo para imprimir el color del Perro
        System.out.println("El color del perrito es: " + color);  //Imprime el color de la clase "Perro"
        System.out.println("El color del animalito es: " + super.color);  //Imprime el color de la clase "Animal"
    }

    //Caso2
    void eat(){  //Metodo de la clase hija
        System.out.println("Esta comiendo carne");  //Imprime lo que esta comiendo
    }

    void Sleep(){  //Otro metodo de la clase hija
        System.out.println("Ya se durmio mi princesita");  //Imprime si ya se durmio el perrito
    }

    void Call(){  //Se crea otro metodo en cual llamaremos algunos de nuestros metodos anteriores en esta clase o en la padre
        super.eat();  //Traemos el metodo eat() pero el de la clase padre y eso lo indicamos con la palabra "super"
        Sleep();  //Traemos el metodo Sleep() de esta clase(Perro)
    }

    //Caso3
    Perro(){    //Se crea un constructor de la clase hija "Perro"
        super();    //Trae a el constructor de la clase padre
        System.out.println("Se ha creado un perro");
    }
}

public class SuperTest {  //Clase para probar nuestro metodos de las clases anteriores
    public static void main(String[] args) {

        //Caso1
        //Objeto anonimo: no tienen ningun nombre y no tienen un tipo
        //new Perro().printColor();  //Se crea un objeto anonimo

        //Caso2
        //new Perro().Call();

        //Caso3
        new Perro();  //Se crea un objeto anonimo para llamar al constructor de la clase Perro el cual trae el de la clase animal
    }
}
