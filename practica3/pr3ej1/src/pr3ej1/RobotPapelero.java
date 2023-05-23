
package pr3ej1;

public class RobotPapelero extends RobotRecolector{

    public RobotPapelero(int id,int avMin, int caMin, int avMax, int caMax) {
        super(id,avMin, caMin, avMax, caMax,3);
    }    
    
    @Override
    public int limpiarEsquina() {            
        int cant = 0;
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++;
        }
        
        return cant;    
    }

    @Override
    public void depositar() {
        depositarPapel();
    }    
    
}
