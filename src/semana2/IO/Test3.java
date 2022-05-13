package semana2.IO;

//Programa para leer un archivo

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Hola.txt");  //FileOutputStream (Tarea de lectura)
            int i = fis.read();  //La asignamos a un entero lo que se leeyó dentro del archivo para poder leer las posiciones de cada caracter
            System.out.println((char)i);  //Al ser un flujo se debe leer caracter por caracter
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
