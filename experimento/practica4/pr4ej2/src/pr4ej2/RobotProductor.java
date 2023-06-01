
package pr4ej2;
import rInfo.*;

public class RobotProductor extends Robot{

    public RobotProductor(int id) {
        super(id);
    }
    
    @Override
    public void comenzar() {
        int cantP = 0;
                
        //mientras siga dentro de mi recorrido
        while(posCa() < 100){
            
            cantP = tomarPapeles(cantP);
 
            mover();
            
            
        }
        
    }

    
    public int tomarPapeles(int cantP){

        while(hayPapelEnLaEsquina()){
        
            if(cantP < 5){
                tomarPapel();
                cantP++;
            }

            else{
                moverseAlDeposito();
                cantP = 0;
            }
        
        }
            
        return cantP;
    }
    
    public void moverseAlDeposito(){
        int avAct = posAv();
        int caAct = posCa();

        bloquearEsquina(50,50);
        pos(50,50);

        depositarPapeles(5);

        pos(avAct,caAct);
        liberarEsquina(50,50); 
    }
    
    public void depositarPapeles(int cant){
        for (int i = 0; i < cant; i++) {
            depositarPapel();
        }
    }
    
    
}
