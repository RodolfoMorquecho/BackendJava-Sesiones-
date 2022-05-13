//Implementaremos los metodos de la interface para el Champion Ashe
//Extendemos o heredamos de Champion todas las propiedades/campos , lo que nos dice que Ashe es una Champion

public class Ashe extends Champion implements AsheActionCallbacks{
    //Constructor que nos proporciona el extends de Champion
    //Nos sirve para poder probar nuestra clase Ashe
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        //Accedemos al metodo "setVisible" mediante el objeto 's' de tipo Screen y lo ponemos en true para que sea visible
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Colors.CityLights);  //Le damos estilo a la fuente del mensaje que sacaremos
        s.showImage("frostShot.gif");  //Accedemos al metodo mediante el objeto 's' para mostrar la imagen
        s.setBounds(200,100,1100,900);  //Definimos las dimensiones
    }

    @Override
    public void hawkShot(Screen s) {
        //Se repite el contenido de la habilidad anterior a excpcion del "setVisible()"
        //En su lugar usamos "cls()" para limpiar la pantalla
        s.cls();
        s.repaint();  //Nos repinta la interface grafica de esta habilidad
        s.out(showMessage(),"Helvetica", 28, Colors.CityLights);
        s.showImage("hawkShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();  //Nos repinta la interface grafica de esta habilidad
        s.out(showMessage(),"Helvetica", 28, Colors.CityLights);
        s.showImage("rangerFocus.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();  //Nos repinta la interface grafica de esta habilidad
        s.out(showMessage(),"Helvetica", 28, Colors.CityLights);
        s.showImage("volley.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica", 28, Colors.CityLights);
        s.showImage("crystalArrow.gif");
        s.setBounds(200,100,1100,900);
    }
}
