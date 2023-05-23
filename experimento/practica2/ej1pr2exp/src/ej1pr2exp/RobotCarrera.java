
package ej1pr2exp;
import rInfo.*;

public class RobotCarrera extends Robot{

    //defino al robot con el id
    public RobotCarrera(int id) {
        super(id);
    }
    
    
    @Override
    public void comenzar() {
        int cantFlores;
        
        cantFlores = recorrerLinea(9);
        
        //preguntar si al profe le gusta que haga esto:
        
        switch (getId()){
            case 1: enviarMensaje(2, cantFlores); break;            
            case 2: enviarMensaje(1, cantFlores); break;
            default: System.out.println("error!"); break;
        }
        
        int cantidadOtro = recibirMensaje().getMensajeInt();
        
        /* "el robot que recogió mayor cantidad de flores debe informar la 
        diferencia de flores que obtuvo respecto al robot perdedor"*/
        
        if(cantFlores > cantidadOtro)
            informar("soy el Robot " + getId() + ". Recibi " + (cantFlores - cantidadOtro) + " flor/es mas");
        
        System.out.println("cantidad del otro: "+ cantidadOtro);
    }
    
    
    public int recorrerLinea(int distancia){
        int cantFlores = 0;
        
        for (int i = 0; i < distancia; i++) {
            mover();
            cantFlores += tomarFlores();
        }
        
        return cantFlores;
    }
    
    public int tomarFlores(){
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        return cant;
    }
    
    
}
