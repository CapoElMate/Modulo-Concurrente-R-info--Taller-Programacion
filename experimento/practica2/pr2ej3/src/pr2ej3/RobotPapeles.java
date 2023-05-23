
package pr2ej3;
import rInfo.*;

public abstract class RobotPapeles extends Robot{

    public RobotPapeles(String nombre){
        super(nombre);
    }
    
    public int recogerPapeles(){
        int cant = 0;
                
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++;
        }        
            
        return cant;
    }
    
    public int recorrerLinea(int distancia){
        int cant = 0;
        
        for (int i = 0; i < distancia; i++) {
            cant += recogerPapeles();
            mover();
        }
        
        cant += recogerPapeles();
        
        return cant;
    }    
}
