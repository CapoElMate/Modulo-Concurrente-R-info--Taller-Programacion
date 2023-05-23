

package pr2ej2;
import java.util.Random;
import rInfo.*;

public class RobotEscalon extends Robot {

    public RobotEscalon(int id) {
        super(id);
    }
    
    private void izquierda(){
        for (int i = 0; i < 3; i++) {
            derecha();
        }
    }
            

    private int contarFlores(){
        int cant = 0;
        
        //tomo todas las flores en la esquia y las cuento
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        //las vuelvo a dejar
        for (int i = 0; i < cant; i++)
            depositarFlor();
        
        return cant; //retorno la cantidad
    }
    
    private int contarPapeles(){
        int cant = 0;
        
        //tomo todas las flores en la esquia y las cuento       
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++;
        }
        
        //las vuelvo a dejar
        for (int i = 0; i < cant; i++)
            depositarPapel();
        
        return cant; //retorno la cantidad de papeles
    }
    
    //* el escalon retorna true si tenia mas flores que papeles.
    public boolean escalon(int alto, int ancho){
        
        int cantF = 0; //F: flores
        int cantP = 0; //P: papeles
        
        //Escalon que sube
        for (int i = 0; i < alto; i++) {
            cantF += contarFlores();
            cantP += contarPapeles();
            mover();
        }
        
        derecha();
        
        //escalon de costado
        for (int i = 0; i < ancho; i++) {
            cantF += contarFlores();
            cantP += contarPapeles();
            mover();
        }
        
        izquierda();//giro a la izquierda(derecha x 3), para volver a la pos. inicial
        
        return (cantF > cantP); // retorno true si hay mas flores que papeles.
    }
    
    
    
    @Override
    public void comenzar() {
        
        int cantCumpleCondicion = 0; // la cantidad de escalones que cumplen la condicion * (arriba) 
                
        Random rand = new Random();     //generador aleatorio.
        
        for(int i = 0; i < 4 ; i++){  
            
            int altRnd =  rand.nextInt(5)+1;    //genero nro random.            
        
            cantCumpleCondicion += escalon(altRnd ,1) ? 1: 0 ; // si escalon = true le sumo 1 a cantCumpleCondicion.                    
        
        }//repito 4 veces
        
        enviarMensaje("jefe", cantCumpleCondicion);        
    }
    
}
