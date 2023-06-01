
package pr4ej4;
import rInfo.*;
import java.util.Random;

public class RobotMaster extends Robot{

    public RobotMaster(String name) {
        super(name);
    }

    //constantes:
    final int cantTrabajadores = 2;
    
    
    @Override
    public void comenzar() {
        //variables del robot:
        int av,ca;
        int tarea;
        int trabajador;
        
        //genero 10 tareas
        for (int i = 0; i < 10; i++) {
            av = posAleatoria();
            ca = posAleatoria();
            
            tarea = tareaAleatoria();
            trabajador = trabajadorAleatorio();
            
            //System.out.println("tarea" + tarea);
            
            enviarMensaje(trabajador,tarea);
            enviarMensaje(trabajador,av);
            enviarMensaje(trabajador,ca);            
        }
        
        //envio el mensaje 4 (fin) a todos los trabajadors.
        for (int i = 1; i <= cantTrabajadores; i++) {
            enviarMensaje(i,4);
        }
    }
    
    private int tareaAleatoria(){
        Random r = new Random();
        
        return r.nextInt(3)+1; // del 1 al 3.
    }
    
    private int posAleatoria(){
        Random r = new Random();
        
        return r.nextInt(99)+2; //desde 2 a 100
    }
    
    private int trabajadorAleatorio(){
        Random r = new Random();
        
        return r.nextInt(cantTrabajadores)+1; //1 o 2
    }

}
