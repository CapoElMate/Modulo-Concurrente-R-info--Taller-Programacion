
package pr3ej3;
import rInfo.*;

public class RobotRecolector extends Robot {

    public RobotRecolector(int id) {
        super(id);
    }

    private int avDestino,caDestino;
    private int avOrigen,caOrigen;
    private boolean seguir;
    
    private int cantFlores;
    
    @Override
    public void comenzar() {
        
        //las posiciones iniciales del robot. las guardo al inicio.
        avOrigen = posAv();  
        caOrigen = posCa();
        
        //recibo del jefe la posicion de la esquina a limpiar
        avDestino = recibirMensaje(0).getMensajeInt();
        caDestino = recibirMensaje(0).getMensajeInt();
        
        // seguir se va a encargar de definir si sigo repitiendo el bucle de tomar una flor a la vez.
        seguir = true;  // inicio en true
        
        //la cantidad de flores que este robot consiguio
        cantFlores = 0;
        
        // Si ya no hay mas flores salgo del bucle.
        while(seguir){
            //bloqueo la esquina a recoger y me muevo ahi
            bloquearEsquina(avDestino, caDestino);
            pos(avDestino, caDestino);
            
            cantFlores += tomarUnaFlor();   //tomo una flor. sumo 1 a cantFlores si habia.
            
            seguir = hayFlorEnLaEsquina();  //verifico que haya una flor en el piso. si no hay mas salgo del bucle.          
            
            //me muevo al origen y desbloqueo la esquina de recogida.
            pos(avOrigen,caOrigen);            
            liberarEsquina(avDestino, caDestino);            
        }
        
        //cuando ya no me quedan mas flores en la esquina le mando un mensaje al jefe con la cantidad de flores.
        enviarMensaje(0,cantFlores);
    }
    
    //tomo una flor. retorno 
    private int tomarUnaFlor(){
        
        boolean habiaFlor = hayFlorEnLaEsquina();
        
        if(habiaFlor)
            tomarFlor();
        
        return habiaFlor ? 1: 0; // devuelvo 1 si habia una flor, 0 si no.
        
    }
    
    
}
