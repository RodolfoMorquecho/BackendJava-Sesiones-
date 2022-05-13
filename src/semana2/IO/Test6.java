package semana2.IO;

//Programa para leer un archivo mediante un while

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {  //throws hace la funcion del catch, para al guna falla
        FileInputStream fis = new FileInputStream("C:\\magia.txt");  //Creamos un objeto-archivo
        BufferedInputStream bin = new BufferedInputStream(fis);    //Creamos un objeto "bin" que reerva espacio de memoria del tamaño del archivo

        int i;
        while ((i=fis.read()) != -1){  //Va a ir leyando el archivo "mientras" que no se encuentre con el posicionamiento del arreglo "-1"
            System.out.print((char) i);    //Convierte el entero que va leyendo en un caracter
        }

        bin.close();
        fis.close();

    }
}
