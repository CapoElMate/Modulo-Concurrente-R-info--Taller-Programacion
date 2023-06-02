
package pr3ej6;
import rInfo.*;


public class RobotCoordinador extends Robot {
    
    public RobotCoordinador(String name) {
        super(name);
    }

    @Override
    public void comenzar() {
        enviarMensaje(1,6);
        enviarMensaje(2,10);
        enviarMensaje(3,7);
        
        int primero = recibirMensaje().getIDEmisor();
        enviarMensaje(primero,20);

        int segundo = recibirMensaje().getIDEmisor();
        enviarMensaje(segundo,21);

        int tercero = recibirMensaje().getIDEmisor();
        enviarMensaje(tercero,22);
        
        
    }
    
    
}
