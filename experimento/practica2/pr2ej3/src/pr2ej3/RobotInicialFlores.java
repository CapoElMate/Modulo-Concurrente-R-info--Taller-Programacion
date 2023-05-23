
package pr2ej3;


public class RobotInicialFlores extends RobotFlores{

    public RobotInicialFlores() {
        super("B1");
    }    
    
    @Override
    public void comenzar() {
        int cant = 0;
        
        derecha();
        cant += recorrerLinea(9);
        
        enviarMensaje("B2",cant);
    }
}
