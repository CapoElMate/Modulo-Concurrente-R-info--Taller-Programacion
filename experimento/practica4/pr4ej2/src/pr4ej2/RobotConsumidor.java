
package pr4ej2;
import rInfo.*;
import java.util.Random;

public class RobotConsumidor extends Robot{

    public RobotConsumidor(int id) {
        super(id);
    }
    
    @Override
    public void comenzar() {
        int avOrigen,caOrigen;
        int cantPapeles;    
        int cantVecesSinPapeles = 0;
        Random rand = new Random();
        
        avOrigen = posAv();
        caOrigen = posCa();
       
        //si hay 8 veces que no junto papeles, me salgo del bucle
        while(cantVecesSinPapeles < 8){

            cantPapeles = rand.nextInt(4)+2; // genero un nro entre 2 y 5

            bloquearEsquina(50, 50);
            pos(50,50);

            //si habia papeles, no le sumo nada a la variable, si habia, le sumo 1

            if(tomarPapeles(cantPapeles))
                cantVecesSinPapeles = 0;
            else
                cantVecesSinPapeles++;
            
            pos(avOrigen,caOrigen);
            liberarEsquina(50,50);
        }
    }
    
    //devuelve true si habia la cantidad requerida de papeles. false c.c.
    public boolean tomarPapeles(int cant){
        
        while(hayPapelEnLaEsquina() && cant > 0){
            tomarPapel();
            cant--;
        }
        
        return (cant == 0); // devuelvo true si la cantidad es cero.
    }
    
}
