
package pr3ej1;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //areas:
        Area areaFlores = new AreaPC(1,1,5,10);
        Area areaPapeles = new AreaPC(6,1,10,9);
        Area inicioF = new AreaPC(6,10,7,10);
        Area inicioP = new AreaPC(8,10,9,10);
        
        Area fin = new AreaC(10,10,10,10);
        
        //robots 
        Robot r1 = new RobotFlorero(1,1,1,5,10);
        Robot r2 = new RobotFlorero(2,1,1,5,10);
        
        Robot r3 = new RobotPapelero(3,6,1,10,9);
        Robot r4 = new RobotPapelero(4,6,1,10,9);
        
        
        //objetos:
        areaFlores.agregarFlores(100);
        areaPapeles.agregarPapeles(100);
        
        //asignar
        areaFlores.agregarRobot(r1);
        areaFlores.agregarRobot(r2);
        inicioF.agregarRobot(r1);
        inicioF.agregarRobot(r2);
        
        areaPapeles.agregarRobot(r3);
        areaPapeles.agregarRobot(r4);
        inicioP.agregarRobot(r3);
        inicioP.agregarRobot(r4);
        
        fin.agregarRobot(r1);
        fin.agregarRobot(r2);
        fin.agregarRobot(r3);
        fin.agregarRobot(r4);
        
        //iniciar:
        r1.iniciar(6, 10);
        r2.iniciar(7, 10);
        r3.iniciar(8, 10);
        r4.iniciar(9, 10);
        
        
    }
    
}
