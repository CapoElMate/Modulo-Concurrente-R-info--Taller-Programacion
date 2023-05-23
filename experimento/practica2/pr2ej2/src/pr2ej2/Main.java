
package pr2ej2;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //areas
        Area a = new AreaC(1,1,100,100);
        
        //robots
        Robot rbts[] = {new RobotEscalon(1),
                        new RobotEscalon(2),
                        new RobotEscalon(3)};
        
        Robot jefe = new RobotJefe();
        
        
        //ff y pp
        a.agregarFlores(2000);
        a.agregarPapeles(2000);


        //iniciar
        a.agregarRobot(jefe);
        
        for (int i = 0; i < rbts.length; i++)
            a.agregarRobot(rbts[i]);
        
        jefe.iniciar(1, 1);
        
        rbts[0].iniciar(2, 1);
        rbts[1].iniciar(7, 1);
        rbts[2].iniciar(12, 1);
        
    }
    
}
