package TALLER_2_JAVA;


public class Asiento {
    String color; 
    int precio;
    int registro; 
    public void cambiarcolor(String color){
        if (color=="Rojo" ||color=="Verde" ||color=="Amarillo"||color=="Negro"||color=="Blanco")
        this.color=color;
    }
    
}