package test;
public class Auto {
    String modelo; 
    int precio; 
    Asiento [] asientos; 
    String marca;
    Motor motor;
    int registro; 
    static int cantidad_Creados;
    
    int cantidad_Asientos(){ 
    
        int numAsientos=0;
        for (int i =0; i<asientos.length; i+=1){
        
                if (asientos[i]!=null)
                {
                    numAsientos+=1;
                }
        }
        return numAsientos;
    }
    String verificar_Integridad()
    {   
        if (registro==motor.registro)
        {    
            for (int i=0;i<asientos.length;i+=1)
            {
                if(asientos[i]!=null)
                {    
                    if (asientos[i].registro!=registro)
                    {
                        return"Las piezas no son originales";
                    }       
                }    
            }
            return"Auto original";      
        }else{
            return "Las piezas no son originales";
        }    
    }
}
     
     
