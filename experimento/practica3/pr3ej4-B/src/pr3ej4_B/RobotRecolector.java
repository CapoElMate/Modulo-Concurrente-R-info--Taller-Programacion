package pr3ej4_B;
import rInfo.*;

public class RobotRecolector extends Robot{

    public RobotRecolector(int id) {
        super(id);
    }
    
    @Override
    public void comenzar() {
        int avIni,caIni;
        
        boolean seTomoFlor = true;
        
        avIni = posAv();
        caIni = posCa();
        
        while(seTomoFlor){
            
            bloquearEsquina(10, 10);
            pos(10,10);
            
            seTomoFlor = tomarFlorEsquina();
            
            pos(avIni,caIni);
            
            liberarEsquina(10, 10);
            
            bloquearEsquina(11,11);
            pos(11,11);
            
            if(seTomoFlor)
                depositarFlor();
            
            pos(avIni,caIni);
            
            liberarEsquina(11,11);            
        }
        
        enviarMensaje("coordinador", "fin");        
        
        
    }
    
    private boolean tomarFlorEsquina(){
        boolean habiaFlor;
        
        habiaFlor = hayFlorEnLaEsquina();
        
        if(habiaFlor)
            tomarFlor();
        
        return habiaFlor;
    }
    
    
}
