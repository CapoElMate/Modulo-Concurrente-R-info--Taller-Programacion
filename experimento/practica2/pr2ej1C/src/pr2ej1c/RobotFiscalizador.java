
package pr2ej1c;
import rInfo.*;

public class RobotFiscalizador extends Robot {

    //como se que si o si el fiscalizador va a tener de nombre "fiscalizador" lo implemento directamente:
    public RobotFiscalizador() {
        super("fiscalizador"); // preguntar si esta bien.
    }    
    
    @Override
    public void comenzar() {
        //int cant[] = new int[8];
        
        int idMax = -1;
        int cantMax = -1;
        int cantAct;
        
        
        for (int i = 1; i <= 6; i++) {
            
            cantAct = recibirMensaje(i).getMensajeInt();
            
            if(cantAct > cantMax){
                idMax = i;
                cantMax = cantAct;
            }
            
        }
        
        informar("el robot ganador es el " + idMax + " ; con " + cantMax + " flores.");
        
        
    }
    
    
    
}
