
package pr4ej1;
import rInfo.*;
import java.util.Random;


public class RobotCliente extends Robot {

    public RobotCliente(int id) {
        super(id);
    }     
    
    @Override
    public void comenzar() {
        Random rand = new Random();
        int cantF;
                
        while(posCa() < 100){
            //INICIO: 
            //calcularRandom flores
            cantF = rand.nextInt(4)+1;

            //Enviar ID al servidor                
            //Enviar cantFlores al servidor
            enviarMensaje("servidor", cantF);

            //Enviar mi Avenida actual    
            enviarMensaje("servidor",posAv());

            //Enviar Calle siguiente
            enviarMensaje("servidor",posCa()+1);

            //Esperar ACK del servidor
            recibirMensaje("servidor");

            //Ir a la esquina Avenida,Calle
            pos(posAv(),posCa()+1);

            //JuntarFlores
            juntarFlores();

            //Volver a la esquina
            pos(posAv(),posCa()-1);

            //Avanzar dejando flores
            avanzarDejandoFlores();//NOTA: dejar de avanzar si llego a la esq. 100

            //Si llegué a la avenida 100
            //enviar 0 al servidor
            //sino
            //Volver a INICIO
            //delay(1);
        }
        
        enviarMensaje("servidor", 0);
    }
    
    private void avanzarDejandoFlores(){
        while(hayFlorEnLaBolsa() && (posCa() < 100)){
            depositarFlor();
            mover();
        }
    }
    
    private void juntarFlores(){
        while(hayFlorEnLaEsquina())
            tomarFlor();        
    }
    
    public void delay(int nro) {
        for (int i = 0; i < nro; i++) {
            derecha();
            derecha();
            derecha();
            derecha();
        }
    }
    
}
