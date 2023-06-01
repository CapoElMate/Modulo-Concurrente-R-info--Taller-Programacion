
package pr4ej3;
import rInfo.*;

public class RobotCorredor extends Robot{

    public RobotCorredor(int id) {
        super(id);
    }

    @Override
    public void comenzar() {
        
        int esqRecorridas = 0;
        
        //Recibo el msj de inicio:
        recibirMensaje();
        
        //mientras no me salgue de la ciudad:
        while(posCa() < 100){
            recorrerLinea(5);//recorro tomando papeles en pasos de 5
            
            // paso como argumento la id de si mismo para excluirse.
            enviarMensajeATodos(getId()); 
            recibirMensajeDeTodos(getId()); 
        }
        
    }
    
    public void recorrerLinea(int dist ){
        for (int i = 0; (i < dist) && (posCa() < 100) ; i++) {
            tomarPapeles();  
            mover();
        }
    }
    
    public void tomarPapeles(){
        while(hayPapelEnLaEsquina()){
            tomarPapel();
        }
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
