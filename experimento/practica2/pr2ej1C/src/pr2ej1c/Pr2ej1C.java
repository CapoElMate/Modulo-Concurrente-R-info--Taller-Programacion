
package pr2ej1c;
import rInfo.*;

public class Pr2ej1C {

    public static void main(String[] args) {
        
        //definir areas
            //areas de los corredores
        Area a1 = new AreaP(1,1,1,10);
        Area a2 = new AreaP(2,11,2,20);
        Area a3 = new AreaP(3,21,3,30);
        Area a4 = new AreaP(4,31,4,40);
        Area a5 = new AreaP(5,41,5,50);
        Area a6 = new AreaP(6,51,6,60);
            //Area para agregar flroes y fiscal
        Area a = new AreaC(1,1,100,100);
                
        //iniciar robots
        Robot rob1 = new RobotCarrera(1);
        Robot rob2 = new RobotCarrera(2);
        Robot rob3 = new RobotCarrera(3);
        Robot rob4 = new RobotCarrera(4);
        Robot rob5 = new RobotCarrera(5);
        Robot rob6 = new RobotCarrera(6);
        
        Robot fiscal = new RobotFiscalizador();
        
        
        //agregar flores y papeles
        a.agregarFlores(2000);
        
        //iniciar programa
        a1.agregarRobot(rob1);
        a2.agregarRobot(rob2);
        a3.agregarRobot(rob3);
        a4.agregarRobot(rob4);
        a5.agregarRobot(rob5);
        a6.agregarRobot(rob6);
        
        a.agregarRobot(fiscal);
        
        rob1.iniciar(1,1);
        rob2.iniciar(2,11);
        rob3.iniciar(3,21);
        rob4.iniciar(4,31);
        rob5.iniciar(5,41);
        rob6.iniciar(6,51);
        
        fiscal.iniciar(2, 1);
    
    }
    
}
