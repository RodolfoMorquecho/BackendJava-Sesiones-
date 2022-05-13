package semana2.IO;

//Crearemos un archivo mediante un hilo

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("C:\\HolaHilo.txt");
                    fos.write(65);
                    fos.close();
                }catch (IOException ioe){
                    System.out.println(ioe);
                }
            }
        };

        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
