package test;

public class Asiento {
    String color; 
    int precio;
    int registro; 
    void cambiarcolor(String color){
        if (color=="Rojo" ||color=="Verde" ||color=="Amarillo"||color=="Negro"||color=="Blanco")
        this.color=color;
    }
    
}