
package pr3ej2;
import rInfo.*;

public class RobotFiscalizador extends Robot{

    public RobotFiscalizador(String name) {
        super(name);
    }
    
    @Override
    public void comenzar() {
        int idPrimero = recibirMensaje().getIDEmisor(); //el primer mensaje que llega es el que llega al medio primero.
        recibirMensaje();//el segundo no me importan los datos , es del que perdio.
        
        recibirMensaje();//estos dos ultimos estan para esperar que ambos terminen la carrera.
        recibirMensaje();//no me importan los datos.
                
        
        informar("el robot" + idPrimero + " llego primero.");
        //System.out.println("el robot" + idPrimero + " llego primero.");
        
    }
    
    
    
}
