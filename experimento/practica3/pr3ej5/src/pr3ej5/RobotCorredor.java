package pr3ej5;
import rInfo.*;

public class RobotCorredor extends Robot {

    public RobotCorredor(int id) {
        super(id);
    }
    
    @Override
    public void comenzar() {
        
        boolean hayPapel = juntarPapel();
        int distancia = 0;
        
        
        while(hayPapel){
            
            depositarPapel();
        
            distancia += hayPapel ? 1 : 0; // si hay papel dist = dist +1.
                    
            mover();
            
            hayPapel = juntarPapel();
        }      
        
        
        //cuando termino:
        enviarMensaje("coordinador",distancia);
        
    }

    private boolean juntarPapel(){
        boolean hayPapel;
        int av = posAv();
        int ca = posCa();
        
        bloquearEsquina(11, 11);
        pos(11,11);
        
        hayPapel = hayPapelEnLaEsquina();
        
        if(hayPapelEnLaEsquina())
            tomarPapel();
        
        pos(av, ca);
        liberarEsquina(11, 11);        
        
        return hayPapel;
    }
    
}
