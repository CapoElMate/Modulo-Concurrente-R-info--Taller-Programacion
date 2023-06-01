
package pr4ej2;
import rInfo.*;


public class Main {

    public static void main(String[] args) {
        //areas
        Area areasP[] = {
            new AreaP(5,1,5,100),
            new AreaP(10,1,10,100)
        };
        
        Area areasC[] = {
            new AreaP(11,1),
            new AreaP(12,1)
        };
        
        Area areaDeposito = new AreaPC(50,50);
        
        
        
        //robots
        Robot robotsP[] = {
            new RobotProductor(0),
            new RobotProductor(1)
        };
        
        Robot robotsC[] = {
            new RobotConsumidor(2),
            new RobotConsumidor(3)
        };
        
        
        //asignar
        areaDeposito.agregarRobot(robotsP[0]);
        areaDeposito.agregarRobot(robotsP[1]);
        areaDeposito.agregarRobot(robotsC[0]);
        areaDeposito.agregarRobot(robotsC[1]);
        
        areasP[0].agregarRobot(robotsP[0]);
        areasP[1].agregarRobot(robotsP[1]);
        
        areasC[0].agregarRobot(robotsC[0]);
        areasC[1].agregarRobot(robotsC[1]);
        
        
        //agregarPapeles()
        areasP[0].agregarPapeles(90);
        areasP[1].agregarPapeles(90);
        
        //iniciar robots
        robotsP[0].iniciar(5,  1);
        robotsP[1].iniciar(10, 1);
        robotsC[0].iniciar(11, 1);
        robotsC[1].iniciar(12, 1);
        
    }
    
}
