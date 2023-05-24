
package pr3ej2;

public class RobotFlores extends RobotPlantilla{

    public RobotFlores(int id) {
        super(id);
    }

    @Override
    public void comenzar() {
        //hago 4 escalones con tamaño descendente, de 5,4,3 y 2
        for (int i = 5; i > 1; i--) {
            cantElementos += escalonDerecha(i);
        }
        
        //para el ultimo escalon de 1 de tamaño, primero tengo que bloquear la esquina que se junta el recorrido.
        bloquearEsquina(16, 16);
        enviarMensaje("fiscalizador");        
        
        cantElementos += escalonDerecha(1); // escalon de 1 tamaño
        
        izquierda(); //giro a la izquierda
        mover();     //me muevo
        
        liberarEsquina(16, 16); // libero la esquina
        
        cantElementos += juntar(); // junto el elemento que esta en el piso
        
        //hago 4 escalones mas hacia la derecha, d tamaño 2,3,4,5.
        for (int i = 2; i <= 5; i++) { 
            cantElementos += escalonDerecha(i);
        }
        
        informar("cantidad de flores recogidas: " + cantElementos); 
        enviarMensaje("fiscalizador");  //le envio un ultimo mensaje al fiscalizador para avisarle que termine.
        
    }

    
    
    
    
    @Override
    public int juntar() {
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++;
        }
        
        return cant;
    }
    
}
