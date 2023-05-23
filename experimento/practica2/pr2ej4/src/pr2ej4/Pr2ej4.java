
package pr2ej4;
import rInfo.*;

public class Pr2ej4 {

    public static void main(String[] args) {
        //areas
        Area caja = new AreaPC(25,25,75,75);
        
        Area area1 = new AreaP(25,1);
        Area area2 = new AreaP(30,1);
        Area area3 = new AreaP(35,1);
        Area area4 = new AreaP(40,1);
        
        Area areaF = new AreaP(1,1);
                
        //robots
        Robot r1 = new RobotRecolector(1);
        Robot r2 = new RobotRecolector(2);
        Robot r3 = new RobotRecolector(3);
        Robot r4 = new RobotRecolector(4);
        
        Robot fisc = new RobotFiscalizador();
        
        //objetos
        caja.agregarFlores(1000);
        caja.agregarPapeles(1000);
        
        //iniciar
        
        
        caja.agregarRobot(r1);
        caja.agregarRobot(r2);
        caja.agregarRobot(r3);
        caja.agregarRobot(r4);

        area1.agregarRobot(r1);
        area2.agregarRobot(r2);
        area3.agregarRobot(r3);
        area4.agregarRobot(r4);
        
        areaF.agregarRobot(fisc);
        
        r1.iniciar(25,1);
        r2.iniciar(30,1);
        r3.iniciar(35,1);
        r4.iniciar(40,1);
        
        fisc.iniciar(1, 1);
        
    }
    
}
