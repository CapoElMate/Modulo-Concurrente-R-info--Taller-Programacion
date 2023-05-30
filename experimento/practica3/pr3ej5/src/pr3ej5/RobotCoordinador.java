package pr3ej5;
import rInfo.*;

public class RobotCoordinador extends Robot {

    public RobotCoordinador(String name) {
        super(name);
    }

    @Override
    public void comenzar() {
        int distMayor,idDistMayor;
        
        Mensaje m ;
        
        distMayor = idDistMayor = -1;
        
        for (int i = 0; i < 4; i++){
            m = recibirMensaje();
            
            if(distMayor < m.getMensajeInt()){
                distMayor = m.getMensajeInt();
                idDistMayor = m.getIDEmisor();
            }
        }
        
        
        
        informar("el que mas lejos llego es el robot: " + idDistMayor + " , con " + distMayor + " esquinas recorridas.");
        
                    
    }
    
    
    
    
}
