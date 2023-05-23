
package pr2ej3;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //areas
        Area areaA = new AreaPC(1,1,20,1);
        Area areaB = new AreaPC(1,5,20,5);
        
        //robots
        Robot ra1 = new RobotInicialPapeles(); 
        Robot ra2 = new RobotFinalPapeles(); 
        
        Robot rb1 = new RobotInicialFlores(); 
        Robot rb2 = new RobotFinalFlores(); 

        //objetos
        areaA.agregarPapeles(50);
        areaB.agregarFlores(50);

        //iniciar
        areaA.agregarRobot(ra1);
        areaA.agregarRobot(ra2);
        
        areaB.agregarRobot(rb1);
        areaB.agregarRobot(rb2);
        
        ra1.iniciar(1,1);
        ra2.iniciar(11,1);
        
        rb1.iniciar(1,5);
        rb2.iniciar(11,5);
        
        
    }
    
}
