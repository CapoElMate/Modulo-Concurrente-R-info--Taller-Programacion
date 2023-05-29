
package pr2ej3;


public class RobotFinalFlores extends RobotFlores{

    //preguntar esto esta bn?
    public RobotFinalFlores() {
        super("B2");	//nota, no esta bn. rompe con la estandarizacion del codigo. debo pasar como parametro el nombre
    }    
    
    @Override
    public void comenzar() {
        int cant = recibirMensaje("B1").getMensajeInt();
        
        derecha();
        cant += recorrerLinea(9);
        
        informar("la cantidad de flores que recogio el equipo B es de: " + cant);
    }
}
