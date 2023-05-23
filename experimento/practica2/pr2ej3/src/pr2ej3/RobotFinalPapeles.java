
package pr2ej3;


public class RobotFinalPapeles extends RobotPapeles{

    //preguntar esto esta bn?
    public RobotFinalPapeles() {
        super("A2");
    }    
    
    @Override
    public void comenzar() {
        int cant = recibirMensaje("A1").getMensajeInt();
        
        derecha();
        cant += recorrerLinea(9);
        
        informar("la cantidad de papeles que recogio el equipo A es de: " + cant);
    }
}
