
package pr3ej6;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //Areas
        //preguntar que areas se necesita:
        Area a1 = new AreaPC(2,2,8,8);
        Area a2 = new AreaPC(5,5,15,15);
        Area a3 = new AreaPC(10,10,17,17);
        
        Area fin = new AreaC(1,20,100,22);
        
        Area aCoord = new AreaP(1,1);
        
        
        //robots
        Robot r[] = {
            new RobotCuadrado(1),
            new RobotCuadrado(2),
            new RobotCuadrado(3)
        };
        
        Robot coord = new RobotCoordinador("coordinador");
        
        
        //asignar
        a1.agregarRobot(r[0]);
        a1.agregarRobot(r[1]);
        
        a2.agregarRobot(r[0]);
        a2.agregarRobot(r[1]);
        a2.agregarRobot(r[2]);
        
        a3.agregarRobot(r[1]);
        a3.agregarRobot(r[2]);
        
        aCoord.agregarRobot(coord);
        
        fin.agregarRobot(r[0]);
        fin.agregarRobot(r[1]);
        fin.agregarRobot(r[2]);
        
        //flores y papeles:
        a1.agregarPapeles(100);
        a1.agregarFlores(100);
        a2.agregarPapeles(100);
        a2.agregarFlores(100);
        a3.agregarPapeles(100);
        a3.agregarFlores(100);
        
        //iniciar
        r[0].iniciar(2,2);
        r[1].iniciar(5,5);
        r[2].iniciar(10,10);
        coord.iniciar(1,1);
    }
    
}
