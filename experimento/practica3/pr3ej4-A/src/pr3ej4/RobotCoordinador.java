package pr3ej4;
import rInfo.*;

public class RobotCoordinador extends Robot{

    public RobotCoordinador(String id) {
        super(id);
    }

    @Override
    public void comenzar() {
        
        int idUltimo = -1;
        
        for (int i = 0; i < 3; i++)
            recibirMensaje();
        
        idUltimo = recibirMensaje().getIDEmisor();
        
        informar("el robot que termino ultimo es: "  +idUltimo);
        
        
        pos(11,11);
        recolectarTodas();
        
    }

    private void recolectarTodas(){
        while(hayFlorEnLaEsquina()){
            tomarFlor();
        }
    }
    
    
}
