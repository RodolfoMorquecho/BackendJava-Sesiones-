package semana2.IO;

//Programa para leer un archivo que contenga una cadena de caracteres

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Hechizo.txt");

            int i = 0;  //Creamos el entero para poder leer las posiciones de cada caracter dentro del archivo

            //Mientras "i" tenga algo que leer, sea diferente de -1
            // i=fis.read() -> "i" tenga algo que leer
            // != -> sea diferente que
            // -1(en esta sentencia) -> ultima posicion del arreglo en el archivo
            while ((i=fis.read()) != -1){
                System.out.print((char) i);
            }
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
