package semana2.IO;

//Creación de Archivo con cadena de caracteres(Sttring)

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");  //Creamos el objeto de tipo archivo
            String s = "Magia!!!";    //En lugar de un caracter, ahora pondremos una cadena de caracteres(bytes) dentro del archivo
            byte b[] = s.getBytes();  //A la variable de tipo "byte" 'b' le asignamos el areglo de caracteres que tiene la variable "s"
            fos.write(b);  //Lo escribimos dentro del archivo
            fos.close();  //Cerramos
            System.out.println("Es magia!!!");  //Mensaje que nos aparecera en consola (esta funcionando)
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
