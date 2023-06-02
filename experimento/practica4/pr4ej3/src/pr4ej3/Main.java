
package pr4ej3;
import rInfo.*;


public class Main {

    public static void main(String[] args) {

        
        //areas
        Area area1 = new AreaP(1,1,1,100);
        Area area2 = new AreaP(2,1,2,100);
        Area area3 = new AreaP(3,1,3,100);

        //Como en Java-info ya le asigno los ids en el Main, no hace falta un coordinador.
        //Area areaCord = new AreaP(4,1);
        
        
        //robot
        Robot rob1 = new RobotCorredor(1);
        Robot rob2 = new RobotCorredor(2);
        Robot rob3 = new RobotCorredor(3);
        //Robot cord = new RobotCoordinador("cordinador");
        
        
        //asignar
        area1.agregarRobot(rob1);
        area2.agregarRobot(rob2);
        area3.agregarRobot(rob3);
        //areaCord.agregarRobot(cord);
        
        //agregar flores
        area1.agregarPapeles(10);
        area2.agregarPapeles(50);
        area3.agregarPapeles(200);
        
        //iniciar
        rob1.iniciar(1, 1);
        rob2.iniciar(2, 1);
        rob3.iniciar(3, 1);
        //cord.iniciar(4,1);
        
    }
    
}
