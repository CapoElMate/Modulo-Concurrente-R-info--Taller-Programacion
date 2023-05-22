
import rInfo.*;


public class Main {

    public static void main(String[] args) {
        //definir areas
        Area area = new AreaP(1, 1, 100, 100);
        
        //iniciar robots
        Robot robot = new RobotEscalera(1);
        
        //agrego flores:
        area.agregarFlores(500);
        
        //agrego papeles:
        area.agregarPapeles(10000);
        
        //iniciar programa
        area.agregarRobot(robot);
        robot.iniciar(1, 1);
        
    }
    
}
