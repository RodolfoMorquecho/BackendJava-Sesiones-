public interface AsheActionCallbacks {
    //Lo que hace Ashe(LOL)
    void frostShot(Screen s);  //Le pasamos un objeto 's' de la clase "Screen" porque queremos trabajar con la interface grafica
    void hawkShot(Screen s);
    void rangerFocus(Screen s);
    void volley(Screen s);
    void crystalArrow(Screen s);
}
