
package pr3ej3;
import rInfo.*;
import java.util.Random;

public class RobotJefe extends Robot {

    //preguntar si hace falta que tenga que iniciar todo aqui arriba, o se puede iniciar dentro del codigo.
    private int avRnd,caRnd;    
    private final int avMin,avMax,caMin,caMax;
    //hace falta que sean private?
    private Random rnd;
    //las constantes las tengo que iniciar en el constructor?
    private final int cantRecolectores;
    
    private int cantMax;
    private int idMax;
    private Mensaje msj;
    
    
    public RobotJefe() {
        super(0);//se puede hacer esto? o si o si lo tengo que tomar como argumento?
        
        // area de recoleccion. (2,2,10,10)
        avMin = 2; 
        caMin = 2;
        
        avMax = 10;
        caMax = 10;
        
        cantRecolectores = 6; // 4 robots recolectors.
    }

    
    @Override
    public void comenzar() {
        rnd = new Random();
        
        //genero una posicion al azar.
        avRnd = rnd.nextInt(avMax-avMin) + avMin; 
        caRnd = rnd.nextInt(caMax-caMin) + caMin;
        
        //le envio dos msj a cada robot con la posicion de la esquina a limpiar.
        for (int i = 1; i <= cantRecolectores; i++) {
            enviarMensaje(i, avRnd); //la posicon de la avenida.
            enviarMensaje(i, caRnd); //la posicion de la calle.
        }        
        
        
        cantMax = -1;//la maxima cantidad de flores que los recolectores mandan. inicio en -1.
        idMax = -1;  //guardo el id del maximo
        msj = null;  //msj va a guardar el mensaje para guardar tambien el ID. Preguntar si esto esta bien.
        
        for (int i = 1; i <= cantRecolectores; i++) {
            msj = recibirMensaje();
            
            if (msj.getMensajeInt() > cantMax){                
                cantMax = msj.getMensajeInt();//preguntar si esto se puede.
                idMax = msj.getIDEmisor();    
            }
        }
        
        informar("el robot que mas junto fue el " + idMax + " , con " + cantMax + " flores.");
        
    }
    
}
