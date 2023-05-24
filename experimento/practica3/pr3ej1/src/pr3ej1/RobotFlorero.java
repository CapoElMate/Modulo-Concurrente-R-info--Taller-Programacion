
package pr3ej1;

public class RobotFlorero extends RobotRecolector{

    public RobotFlorero(int id,int avMin, int caMin, int avMax, int caMax) {
        super(id,avMin, caMin, avMax, caMax,5);
        
    }    
    
    @Override
    public int limpiarEsquina() {            
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        return cant;    
    }

    @Override
    public void depositar() {
        depositarFlor();
    }    
    
}
