
package pr2ej3;


public class RobotInicialPapeles extends RobotPapeles{

    public RobotInicialPapeles() {
        super("A1");
    }    
    
    @Override
    public void comenzar() {
        int cant = 0;
        
        derecha();
        cant += recorrerLinea(9);
        
        enviarMensaje("A2",cant);
    }
}
