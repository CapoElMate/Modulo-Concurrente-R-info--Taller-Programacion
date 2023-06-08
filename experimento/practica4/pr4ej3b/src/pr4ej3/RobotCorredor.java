
package pr4ej3;
import rInfo.*;
import java.util.Random;

public class RobotCorredor extends Robot{

    public RobotCorredor(int id) {
        super(id);
    }

    @Override
    public void comenzar() {
        
        int papelesARecoger = 0;
        
        Random rnd = new Random();
        
        //Recibo el msj de inicio:
        //recibirMensaje();
        
        //mientras no me salga de la ciudad:
        while(posCa() < 100){
            papelesARecoger = rnd.nextInt(5)+1;
            recorrerLinea(papelesARecoger);//recorro hasta tomar 5 papeles o terminar la ciudad
            
            // paso como argumento la id de si mismo para excluirse.
            enviarMensajeATodos(getId()); 
            recibirMensajeDeTodos(getId()); 
        }
        
        enviarMensajeATodos(getId());
        
    }
    
    public void recorrerLinea(int N){
        int cant = 0;        
        
        while((cant < N) && (posCa() < 100)){
            cant += tomarPapeles();  
            mover();
        }
        
    }
    
    public int tomarPapeles(){
        int cant = 0;
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
        }
        
        return cant;
    }
    
    //envio mensaje a todos, pero con una exepcion. (si mismo)
    public void enviarMensajeATodos(int exepcion){
        for (int i = 1; i <= 3; i++) {
            
            if(i != exepcion)
                enviarMensaje(i);
            
        }
    }
    
    //recibo un recibo msj de todos, con una exepcion. (si mismo)
    public void recibirMensajeDeTodos(int exepcion){
        for (int i = 1; i <= 3; i++) {
            
            if(i != exepcion){
                recibirMensaje(i);
            }
            
        }
    }
    

}
