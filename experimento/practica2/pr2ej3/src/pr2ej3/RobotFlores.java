
package pr2ej3;
import rInfo.*;

public abstract class RobotFlores extends Robot{

    public RobotFlores(String nombre){
        super(nombre);
    }
    
    public int recogerFlores(){
        int cant = 0;
                
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }        
            
        return cant;
    }
    
    public int recorrerLinea(int distancia){
        int cant = 0;
        
        for (int i = 0; i < distancia; i++) {
            cant += recogerFlores();
            mover();
        }
        
        cant += recogerFlores();
        
        return cant;
    }    
}
