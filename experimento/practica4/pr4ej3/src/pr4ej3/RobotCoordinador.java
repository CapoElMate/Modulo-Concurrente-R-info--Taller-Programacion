
package pr4ej3;
import rInfo.*;

public class RobotCoordinador extends Robot{

    public RobotCoordinador(String name) {
        super(name);
    }

    @Override
    public void comenzar() {
        for (int i = 1; i <= 3; i++) {
            enviarMensaje(i);
        }
    }

}
