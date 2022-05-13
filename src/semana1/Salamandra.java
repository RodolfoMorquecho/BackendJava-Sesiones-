package semana1;

public class Salamandra {
    //Caracteristicas - Campos
    public int largo, patas;
    public String color, piel, ojos;
    //Metodos
    public int getLargo(){  return largo;  }
    public int getPatas(){  return patas;  }
    public String getColor(){  return color;  }
    public String getPiel(){  return piel;  }
    public String getOjos(){  return ojos;  }
    //Se hara uso de la propiedad de un boleano para validar con true o false. Si es menor o igual a 20cm se ejecutara
    //Set: trae lo que ingreso el usuario y lo conecta con la parte del modelado que esta aquí
    public boolean setLargo(int largo){
        if(largo <= 20){
            this.largo = largo;
            return true;
        }else
            return false;
    }

    public boolean setPatas(int patas){
        if(patas == 4){
            this.patas = patas;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }

    public boolean setPiel(String piel){
        if(!piel.isEmpty()){
            this.piel = piel;
            return true;
        }else
            return false;
    }

    public boolean setOjos(String ojos){
        if(!ojos.isEmpty()){
            this.ojos = ojos;
            return true;
        }else
            return false;
    }

    //Metodo de control que nos permite comprender como funcionara o lo que sucedio arriba
    public String printState(){
        return "largo: "+largo+"\n"+
                "patas: "+patas+"\n"+
                "color: "+color+"\n"+
                "piel: "+piel+"\n"+
                "ojos: "+ojos+"\n";
    }
}
