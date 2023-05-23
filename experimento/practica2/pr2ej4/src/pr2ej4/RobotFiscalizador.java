
package pr2ej4;
import rInfo.*;
import java.util.Random;

public class RobotFiscalizador extends Robot{

    public RobotFiscalizador() {
        super("fiscalizador");
    }

    
    @Override
    public void comenzar() {
        

        //limpieza:
        
        Random rnd = new Random();
        int idRnd;
        
        for (int i = 0; i < 100; i++) {
            idRnd = rnd.nextInt(4)+1; //selecciono un id al azar de los 4
            
            enviarMensaje(idRnd,"limpiar"); //le envio la señal para que limpie, el mensaje puede ser cualquier otra cosa.
            recibirMensaje(idRnd);          //espero a que me confirme que termino para empezar de nuevo.
        }
        
        

        //final:        
        
        int cantAct;
        int mayor = -1;     // variable que guarda la cantidad mas alta que un robot recogio
        int idMayor = -1;   // la id del mas alto.
        
        for (int id = 1; id <= 4; id++) {
            
            enviarMensaje(id,"fin");                        //le aviso a los robots que termino
            cantAct = recibirMensaje(id).getMensajeInt();   //recibo la cantidad de elementos que recogio el robot con la id act.
            
            if(cantAct > mayor){            //remplazo si la act. es mayor que la mayor.
                mayor = cantAct;
                idMayor = id;
            }
            
        }
        
        //le mando a todos el msj "perdiste" exepto al que gano.
        for (int id = 1; id <= 4; id++){
            
            if(id != idMayor)
                enviarMensaje(id,"perdiste");//aqui podria ir cualquier mensaje
            else
                enviarMensaje(id,"ganaste");//aqui solo "ganaste".
            
        }
        
        
        
    }
    
}
