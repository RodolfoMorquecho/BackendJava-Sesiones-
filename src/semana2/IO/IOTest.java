package semana2.IO;

//Creación de un Archivo

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try {  //Inrenta realizar las siguientes instrucciones:
            //Se crea un objeto de tipo FileOutputStream llamado fos, el cual creara un archivo que estara ubicado en "C" y se llamara "Hola"
            FileOutputStream fos = new FileOutputStream("C:\\Hola.txt");
            fos.write(65);  //Escribira la letra "A" dentro del archivo, Se usa lenguaje ASCII
            fos.close();  //Cada que escribimos en un archivo lo debemos cerrar
        }catch (IOException ioe){    //Para alguna excepcion donde haya un error
            System.out.println(ioe);
        }
    }
}
