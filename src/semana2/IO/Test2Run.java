package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("C:\\Hechizo.txt");
                    String s = "Wingardium leviosa!!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia Runnable!!");
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread runMagic = new Thread(rm);
        runMagic.start();
    }
}
