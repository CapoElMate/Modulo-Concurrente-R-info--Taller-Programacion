

package pr3ej2;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        Area a= new AreaC(1,1,100,100);
        
        a.agregarFlores(1000);
        a.agregarPapeles(1000);
        
        Robot r1 = new RobotFlores(1);
        Robot r2 = new RobotPapeles(2);
        Robot fisc = new RobotFiscalizador("fiscalizador");
        
        a.agregarRobot(r1);
        a.agregarRobot(r2);
        a.agregarRobot(fisc);
        
        r1.iniciar(1, 1);
        r2.iniciar(31, 1);
        fisc.iniciar(15,1);
        
    }
    
}
