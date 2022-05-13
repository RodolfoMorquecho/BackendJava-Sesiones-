package semana2.IO;

//Programa en el que se trabaja con un "buffere" en un "fos" -escribiendo un archivo

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\magic.txt");  //Creamos un archivo
            BufferedOutputStream bout = new BufferedOutputStream(fos);  //Creamos un buffere del tamaño del archivo(fos)

            String s = "Hola viajerxs de \nInnovaccion Virtual";
            byte b[] = s.getBytes();

            bout.write(b);    //Le pasamos el arreglo de bytes
            bout.flush();    //Limpar el flujo

            //Cerramos los 2 streams(flujos)
            bout.close();
            fos.close();
            System.out.println("Ready!");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
