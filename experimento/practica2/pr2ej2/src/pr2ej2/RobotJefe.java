package pr2ej2;
import rInfo.*;

public class RobotJefe extends Robot {

    //again, preguntar si esto esta bien:
    public RobotJefe() {
        super("jefe");
    }

    
    
    @Override
    public void comenzar() {
        int[] cantidades = new int[3]; // 3 robots, 3 cants
        
        int sumatoriaCants = 0;
         
        for (int i = 0; i < 3; i++) {
            //Mensaje msj = recibirMensaje().getMensaje();
            
            sumatoriaCants += recibirMensaje().getMensajeInt();
            //System.out.println("msj de "+msj.getIDEmisor() +" ,cant: " + msj.getMensajeInt());
            
        }
        
        informar("sumatoria de los 3: " + sumatoriaCants);
        
    }
    
    
    
}
