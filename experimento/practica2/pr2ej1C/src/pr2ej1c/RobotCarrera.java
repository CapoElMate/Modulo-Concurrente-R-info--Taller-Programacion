
package pr2ej1c;
import rInfo.*;

public class RobotCarrera extends Robot{

    //defino al robot con el id
    public RobotCarrera(int id) {
        super(id);
    }
    
    
    @Override
    public void comenzar() {
        int cantFlores;
        
        cantFlores = recorrerLinea(9);
        
        //preguntar si al profe le gusta que haga esto:
        enviarMensaje("fiscalizador", cantFlores); // al robot con nombre fiscalizador le mando la cant. de flores
        
    }
    
    
    public int recorrerLinea(int distancia){
        int cantFlores = 0;
        
        cantFlores += tomarFlores();
        
        for (int i = 0; i < distancia; i++) {
            mover();
            cantFlores += tomarFlores();
        }
        
        return cantFlores;
    }
    
    public int tomarFlores(){
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        return cant;
    }
    
    
}
