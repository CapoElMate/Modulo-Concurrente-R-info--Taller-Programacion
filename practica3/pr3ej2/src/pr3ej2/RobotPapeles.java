
package pr3ej2;

public class RobotPapeles extends RobotPlantilla{

    public RobotPapeles(int id) {
        super(id);
    }

    @Override
    public void comenzar() {        
        for (int i = 5; i > 1; i--) {
            cantElementos += escalonIzquierda(i);
        }
        
        bloquearEsquina(16, 16);
        enviarMensaje("fiscalizador");
        
        cantElementos += escalonIzquierda(1);
        
        derecha();
        mover();
        liberarEsquina(16, 16);

        
        cantElementos += juntar();
        
        for (int i = 2; i <= 5; i++) {
            cantElementos += escalonIzquierda(i);
        }
        
        informar("cantidad de papeles recogidos: " + cantElementos);
        enviarMensaje("fiscalizador");        
    }

    
    
    
    
    @Override
    public int juntar() {
        int cant = 0;
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++;
        }
        
        return cant;
    }
    
}
