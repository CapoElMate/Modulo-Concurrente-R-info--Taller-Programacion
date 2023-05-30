package pr3ej4;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        
        Area ARec = new AreaC(10,10,11,11);
        Area ADescanso[] = {new AreaP(9,9), 
                            new AreaP(9,10),
                            new AreaP(9,11),
                            new AreaP(9,12)};
        
        Area Acoord = new AreaP(1,1);
        
        
        
        //robots
        Robot recolector[] = {new RobotRecolector(1),
                              new RobotRecolector(2),
                              new RobotRecolector(3),
                              new RobotRecolector(4)};
        
        Robot coord = new RobotCoordinador("coordinador");
        
        
        //asignar
        ARec.agregarRobot(recolector[0]);
        ARec.agregarRobot(recolector[1]);
        ARec.agregarRobot(recolector[2]);
        ARec.agregarRobot(recolector[3]);
        ARec.agregarRobot(coord);
        
        ADescanso[0].agregarRobot(recolector[0]);
        ADescanso[1].agregarRobot(recolector[1]);
        ADescanso[2].agregarRobot(recolector[2]);
        ADescanso[3].agregarRobot(recolector[3]);
        
        Acoord.agregarRobot(coord);
        
        
        //inicio
        ARec.agregarFlores(50);
        coord.iniciar(1,1);
        recolector[0].iniciar(9, 9);
        recolector[1].iniciar(9, 10);
        recolector[2].iniciar(9, 11);
        recolector[3].iniciar(9, 12);
        
    }
    
}
