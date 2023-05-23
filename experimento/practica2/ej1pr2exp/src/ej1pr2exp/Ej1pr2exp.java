
package ej1pr2exp;
import rInfo.*;

public class Ej1pr2exp {

    
    public static void main(String[] args) {
        
        //definir areas
        Area a = new AreaC(1,1,100,100);
                
        //iniciar robots
        Robot rob1 = new RobotCarrera(1);
        Robot rob2 = new RobotCarrera(2);
        
        //agregar flores y papeles
        a.agregarFlores(1000);
        
        //iniciar programa
        a.agregarRobot(rob1);
        a.agregarRobot(rob2);
        rob1.iniciar(1,1);
        rob2.iniciar(2,11);
        
    }
    
}
