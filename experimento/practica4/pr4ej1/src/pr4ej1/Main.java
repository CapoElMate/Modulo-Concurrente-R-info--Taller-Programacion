
package pr4ej1;
import rInfo.*;

public class Main {

    public static void main(String[] args) {
        //areas
        Area areaProvisoria = new AreaC(1,1,100,100);        
        
        //robots 
        Robot clientes[] ={
            new RobotCliente(1),
            new RobotCliente(2),
            new RobotCliente(3),
        };
        
        Robot servidor = new RobotServidor("servidor");
                
        
        //asignar
        areaProvisoria.agregarRobot(clientes[0]);
        areaProvisoria.agregarRobot(clientes[1]);
        areaProvisoria.agregarRobot(clientes[2]);
        areaProvisoria.agregarRobot(servidor);
        
        //agrego flores:
        areaProvisoria.agregarFlores(100, 100, 10000);
        
        //iniciar
        for (int i = 0; i < 3; i++) {
            clientes[i].iniciar(i+1,1);
        }
        servidor.setBolsa(1000,0);
        servidor.iniciar(100, 100);
        
    }
    
    
    
}
