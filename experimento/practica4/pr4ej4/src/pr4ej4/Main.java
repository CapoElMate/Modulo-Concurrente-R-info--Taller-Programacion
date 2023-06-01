
package pr4ej4;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //Areas
        Area aMaster = new AreaP(1,1);
        Area aSlave1 = new AreaP(2,1);
        Area aSlave2 = new AreaP(3,1);
        Area aTrabajo = new AreaPC(2,2,100,100);
        
        //robots
        Robot master = new RobotMaster("master");
        Robot slave1 = new RobotSlave(1);
        Robot slave2 = new RobotSlave(2);
        
        
        //Asignar
        aMaster.agregarRobot(master);
        
        aSlave1.agregarRobot(slave1);
        aSlave2.agregarRobot(slave2);
        
        aTrabajo.agregarRobot(slave1);
        aTrabajo.agregarRobot(slave2);
        
        
        //agregar flores o papeles
        aTrabajo.agregarFlores(10000);
        aTrabajo.agregarPapeles(10000);
        
        //iniciar
        master.iniciar(1, 1);
        slave1.iniciar(2, 1);
        slave2.iniciar(3, 1);
        
        //preguntar si esto es posible:
    //existe el riesgo de que el programa quede bloqueado, y que ningún robot
    //trabajador pueda realizar su tarea. ¿en qué caso puede suceder esto? ¿qué resulta
    //necesario considerar para evitar esta situación?

    }
    
}
