
package pr4ej1;
import rInfo.*;


public class RobotServidor extends Robot {

    public RobotServidor(String name) {
        super(name);
    }   
    
    @Override
    public void comenzar() {
    
        Mensaje m;
        int idCliente = 0;
        int cantF = 0;
        int av,ca;
        int cantRobotsTerminados = 0; 
        
        
        final int  cantidadClientes = 3; // preguntar de donde tendria que sacar la cantidad de clientes
                
        
        //tomarFlores(350);//tengo que tomar flores si o si en este caso
        
        
         //como en este caso no es lo mejor recibir id, cambie que la cond. de corte sea flores = -1.
         while(cantRobotsTerminados < cantidadClientes){
            //INICIO: Recibir ID
            //Recibir N Flores de ID
            m = recibirMensaje();
            cantF = m.getMensajeInt();
            idCliente = m.getIDEmisor();
            
            //si (flores <> 0)
            if(cantF != 0){
                //recibir avenida de ID
                av = recibirMensaje(idCliente).getMensajeInt();
                
                //recibir calle de ID
                ca = recibirMensaje(idCliente).getMensajeInt();
                
                //pos(avenida,calle)
                pos(av,ca);
                
                //depositar N flores
                depositarNFlores(cantF);
                //delay(0);
                //volver a (100,100)
                pos(100,100);
                //enviar ACK a robot ID
                enviarMensaje(idCliente);
            }
            //volver a INICIO
            else{
                cantRobotsTerminados++;
            }
                
         }
         
    }

    private void tomarFlores(int cantFlores){
        for (int i = 0; i < cantFlores; i++) {
            tomarFlor();
        }
    }
    
    private void depositarNFlores(int cantFlores){
        for (int i = 0; i < cantFlores; i++) {
            depositarFlor();
        }
    }
    
    public void delay(int nro) {
        int av,ca;
        
        av = posAv();
        ca = posCa();
        
        for (int i = 0; i < nro; i++) {
            pos(100,100);
            tomarFlor();
            tomarFlor();
            tomarFlor();
            pos(av,ca);
        }
    }
    
}
