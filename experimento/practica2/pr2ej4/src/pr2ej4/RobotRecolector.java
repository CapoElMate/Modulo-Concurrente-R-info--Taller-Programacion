package pr2ej4;

import rInfo.*;
import java.util.Random;

public class RobotRecolector extends Robot{

    public RobotRecolector(int id) {
        super(id);
    }

    private int limpiar(){
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++;
        }
            
        return cant;
    }
    
    
    
    @Override
    public void comenzar() {
        
        String msj;
        Random rnd = new Random();
        int avOrigen,caOrigen;
        int avRnd,caRnd;
        int cant = 0; // cantidad de elementos limpiados.
        
        msj = recibirMensaje("fiscalizador").getMensajeString();
        
        avOrigen = posAv();
        caOrigen = posCa();
        
        //si recibo un mensaje que no sea fin:
        while(!msj.equals("fin")){
            
            avRnd = rnd.nextInt(51) + 25; //desde 25 a 75
            caRnd = rnd.nextInt(51) + 25; //desde 25 a 75
            
            pos(avRnd, caRnd); // me muevo a una pos random
            
            cant += limpiar(); //limpio
            
            pos(avOrigen,caOrigen); // me muevo a la posicion de origen
            
            enviarMensaje("fiscalizador",true);//le aviso al fisc. que volvi
            
            msj = recibirMensaje("fiscalizador").getMensajeString(); // me quedo a la espera del prox. mensaje
        }
        
        enviarMensaje("fiscalizador",cant); // cuando termina todo le envio al fisc. la cantidad de elementos limpiados
        
        msj = recibirMensaje("fiscalizador").getMensajeString();
        
        if(msj.equals("ganaste")){
            pos(50,50);
        }
        
        
        
    }
    
    
    
    
}
