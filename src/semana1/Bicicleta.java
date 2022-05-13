package semana1;
//Modelado de una bicicleta
public class Bicicleta {
    //POJO clase pura
    //Caracteristicas (Variables) - Campos - Propiedades del objeto
    public int pins, rodada;
    public double velocidad;
    public String color;

    //Metodos
    //Funcion donde se usa "get" que es como si dijera que 'es cuando me va a dar la velocidad el programa'
    //Es como si le dijera al programa que cuando yo esciba getVelocidad() es cuando me dara la vel de la bici
    public double getVelocidad(){  return velocidad;  }  //En return va lo que nos regresara (velocidad)
    public int getPins(){  return pins; }
    public int getRodada(){  return rodada;  }
    public String getColor(){  return color;  }

    //Mala practica de programación setters
    //public void setRodada(int rodada){
    //    this.rodada = rodada;
    //}

    //Buena practica de programación
    //Se hara uso de la propiedad de un boleano para validar con true o false, si es mayor a cero y si se ejecutara o no
    //Set: trae lo que ingreso el usuario y lo conecta con la parte del modelado que esta aquí
    public boolean setPins(int pins){  //"int pins" son los piñones ingresados por teclado por usuario
        if(pins > 0){    //Deben de ser mayor a 0 para continuar en la sentencia de validacion
            this.pins = pins;  //"this.pins" son los que estan declarados en le objeto se le asignaran los de teclado (usuario)
            return true;  //Vaida y ejecuta para que funcione
        }else    //no lleva corchetes porque no es una condición compuesta
            return false;  //No ejecuta
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
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
    //Metodo de control que nos permite comprender como funcionara o lo que sucedio arriba
    public String printState(){  //Nos indica en el estado que se encuentran
        return "pins: "+pins+"\n"+
                "rodada: "+rodada+"\n"+
                "velocidad: "+velocidad+"\n"+
                "color: "+color;
    }
  //Hasta aqui se define nuestro metodo
}
