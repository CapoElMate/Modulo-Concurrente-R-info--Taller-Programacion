
package pr3ej3;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        Area cuadrante = new AreaPC(2,2,10,10);
        Area inicio = new AreaC(1,1,7,1);
        
        Robot jefe = new RobotJefe();
        
        Robot rec1 = new RobotRecolector(1);
        Robot rec2 = new RobotRecolector(2);
        Robot rec3 = new RobotRecolector(3);
        Robot rec4 = new RobotRecolector(4);
        Robot rec5 = new RobotRecolector(5); // agregue 2 mas para ver si mi code podia bancarlo.
        Robot rec6 = new RobotRecolector(6);
        
        cuadrante.agregarFlores(1000);
        cuadrante.agregarRobot(rec1);
        cuadrante.agregarRobot(rec2);
        cuadrante.agregarRobot(rec3);
        cuadrante.agregarRobot(rec4);
        cuadrante.agregarRobot(rec5);
        cuadrante.agregarRobot(rec6);
        
        inicio.agregarRobot(jefe);
        inicio.agregarRobot(rec1);
        inicio.agregarRobot(rec2);
        inicio.agregarRobot(rec3);
        inicio.agregarRobot(rec4);
        inicio.agregarRobot(rec5);
        inicio.agregarRobot(rec6);
        
        jefe.iniciar(1, 1);
        rec1.iniciar(2, 1);
        rec2.iniciar(3, 1);
        rec3.iniciar(4, 1);
        rec4.iniciar(5, 1);
        rec5.iniciar(6, 1);
        rec6.iniciar(7, 1);
        
    }
    
}
