package pr3ej5;
import rInfo.*;

public class Pr3ej5 {

    public static void main(String[] args) {
        //Areas
        Area aCarrera[] = { new AreaP(4,1,4,100),
                            new AreaP(6,1,6,100),
                            new AreaP(8,1,8,100),
                            new AreaP(10,1,10,100),
        };
        
        Area aRecoleccion = new AreaPC(11,11);

        Area aCoord = new AreaP(1,1);
        
        
        //robots
        
        Robot rCorredor[] = {
            new RobotCorredor(0),
            new RobotCorredor(1),
            new RobotCorredor(2),
            new RobotCorredor(3)
        };
        
        Robot coord = new RobotCoordinador("coordinador");
        
        
        //asignar
        for (int i = 0; i < 4; i++) {
            aCarrera[i].agregarRobot(rCorredor[i]);            
        }
        
        for (int i = 0; i < 4; i++) {
            aRecoleccion.agregarRobot(rCorredor[i]);
        }
        
        aCoord.agregarRobot(coord);
        
        //iniciar
        
        aRecoleccion.agregarPapeles(50);
        
        rCorredor[0].iniciar(4,1);
        rCorredor[1].iniciar(6,1);
        rCorredor[2].iniciar(8,1);
        rCorredor[3].iniciar(10,1);
        
        coord.iniciar(1,1);
        
    }
    
}
