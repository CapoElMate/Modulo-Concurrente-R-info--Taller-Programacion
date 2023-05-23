/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2ej1b;
import rInfo.*;

public class Pr2ej1B {

    public static void main(String[] args) {
        
        //definir areas
        Area a = new AreaC(1,1,100,100);
                
        //iniciar robots
        Robot rob1 = new RobotCarrera(1);
        Robot rob2 = new RobotCarrera(2);
        Robot fiscal = new RobotFiscalizador();
        
        
        //agregar flores y papeles
        a.agregarFlores(1000);
        
        //iniciar programa
        a.agregarRobot(rob1);
        a.agregarRobot(rob2);
        a.agregarRobot(fiscal);
        rob1.iniciar(1,1);
        rob2.iniciar(2,11);
        fiscal.iniciar(2, 1);
    }
    
}
