
package pr2ej1b;
import rInfo.*;

public class RobotFiscalizador extends Robot {

    //como se que si o si el fiscalizador va a tener de nombre "fiscalizador" lo implemento directamente:
    public RobotFiscalizador() {
        super("fiscalizador"); // preguntar si esta bien.
    }    
    
    @Override
    public void comenzar() {
        int cant1,cant2;
        
        // recibo la cantidad de flores que juntaron el robot con id 1 y 2:
        cant1 = recibirMensaje(1).getMensajeInt(); 
        cant2 = recibirMensaje(2).getMensajeInt();
        
        if(cant1 > cant2)
            informar("El Robot 1 gano. Recogio " + (cant1 - cant2) + " flor/es mas");
        
        else if(cant2 > cant1)
            informar("El Robot 2 gano. Recogio " + (cant2 - cant1) + " flor/es mas");
            
        else 
            informar("empate! nadie gana");
        
    }
    
    
    
}
