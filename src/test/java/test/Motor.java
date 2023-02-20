package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro; 
    
    void cambiar_Registro(int registro){
        this.registro= registro;
    }
    void asignar_Tipo(String tipo){
        if (tipo=="electrico"){
            this.tipo=tipo;
        }    
        if (tipo=="gasolina"){
        }    
    }
}

