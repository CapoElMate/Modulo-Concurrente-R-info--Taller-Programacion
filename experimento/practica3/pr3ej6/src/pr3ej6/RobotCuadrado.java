
package pr3ej6;
import java.util.Arrays;
import rInfo.*;

public class RobotCuadrado extends Robot{

    public RobotCuadrado(int id) {
        super(id);
    }

    @Override
    public void comenzar() {
        
        //preguntar si todo esto esta bien o es una exageracion.
        
        int id = getId();
        
        int[][] posiblesInts = getIntersecciones(id); // guardo las intersecciones.
        
        int diametroCuadrado = recibirMensaje("coordinador").getMensajeInt(); // recibo el diametro del coord.
        
        
        
        for (int i = 0; i < 4; i++) { // 4 por los 4 lados.
            
            for (int j = 0; j < diametroCuadrado; j++) { // depende del diametro se repite
                
                int posSig[] = calcularPosSiguiente(posAv(),posCa(),i); // calculo la posicion siguiente, rotacion "i"
                
                if(esInterseccion(posSig[0], posSig[1],posiblesInts)){ //verifico si la posicion siguiente es una interseccion.
                    //si es:
                    
                    bloquearEsquina(posSig[0], posSig[1]); //bloqueo la prox. esquina
                   
                    mover(); //muevo hacia la pos. bloquedad.
                    
                    limpiar(id);
                    
                    mover(); //me salgo de la pos. bloq.
                    liberarEsquina(posSig[0], posSig[1]); //libero la esquina bloqueda.
                    j++;    //como ya me movi dos veces en el mismo ciclo, le sumo 1 a j, para que el cuadrado no quede desformado.

                    limpiar(id);                   
                }
                
                else{
                    //si no, tengo un bucle de movimiento comun:
                    mover();
                    limpiar(id);                    
                }
                
            }
            
            derecha();            
        }
        
        
        enviarMensaje("coordinador"); // le mando un msj vacio al coord. para avisar que termine.
        
        int nroCalle;   
        
        nroCalle = recibirMensaje("coordinador").getMensajeInt(); // el jefe responde con el nro de calle que me corresponde segun como termine.
        
        derecha();// giro 1 a la derecha
        
        pos(1,nroCalle); // me muevo a la posicion correspondiente
        
        
        //mientras tenga flores o papeles en la bolsa, y no supere el limite del mapa:
        while((hayFlorEnLaBolsa() || hayPapelEnLaBolsa()) && posAv()<100){
            
            //si hay deposito flor
            if(hayFlorEnLaBolsa()) 
                depositarFlor();
            
            //si hay deposito papel
            if(hayPapelEnLaBolsa())
                depositarPapel();
            
            //muevo
            mover();            
        }
    }
    
    
    
    public void limpiar(int id){
        
        //Si es 1, solo se cumple la cond. de las flores
        //si es 2, se cumplen ambas cond.
        //si es 3, solo se cumple la de papeles.
        //(asi me ahorro un switch case que puede ser mas costoso)
        
        if(id <= 2){
            limpiarF();
        }
        if(id >= 2){
            limpiarP();
        }
        
    }
    
    //toma todas las flores de la esquina si es que hay
    //no retorno nada, no hace falta
    public void limpiarF(){  
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
        }
                
    }
    
    //toma todas las flores de la esquina si es que hay
    public void limpiarP(){
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
        }
        
    }
    
    //esInterseccion:
    
    //toma de parametro una avenida y una calle, y un arreglo con las intersecciones de los cuadrados.
    //devuelvo un boolean, true si en ese punto hay una interseccion.
    public boolean esInterseccion(int av,int ca, int[][] intersecciones){
        boolean es = false;
        
        for (int i = 0; i < intersecciones.length ;i++) {            
            es = (es || Arrays.equals(new int[]{av,ca}, intersecciones[i]));
        }
        
        return es;
    }
    
    
    //getIntersecciones:
    
    //funcion que devuelve un arreglo de las intersecciones, toma de parametro el id del robot,
    //y segun el id devuelve unas intersecciones o otras.
    //si no sabria donde interseccionan los cuadros, ej: cambian en cada ejecucuion, 
    //calcularia las intersecciones aqui.
    
    public int[][] getIntersecciones(int idRobot){
        
        int[][] intrs;
        
        switch(idRobot){
            
            case 1:
                    intrs = new int[][] {{5,8},{8,5}};
                break;
            
            case 2:
                    intrs = new int[][] {{5,8},{8,5},{10,15},{15,10}};
                break;
            
            case 3:
                    intrs = new int[][] {{10,15},{15,10}};
                break;
            
            default:
                    intrs = new int[][]{}; // caso por defecto asi no molesta.
                break;
            
        }
        
        return intrs;//[intersecciones][av,ca]   
    }
    
    
    //calcularPosSiguiente:
    //calculo la posicion siguiente a la que va a estar el robot.
    //la calculo con un case, y sabiendo la rotacion del mismo. La rotacion va de 0 a 3.
    
    //la funcion devuelve un arreglo de int, con dos elementos, la avenida y la calle.
    
    public int[] calcularPosSiguiente(int av, int ca, int rotacion){
        switch(rotacion){
                case 0: // arriba
                    ca += 1;
                    break;
                case 1: //derecha
                    av += 1;
                    break;
                case 2: // abajo
                    ca -= 1;
                    break;
                case 3: //izquierda
                    av -= 1;
                    break;                
        }
        
        int i[] = {av,ca};
        
        //System.out.println("pos. siguiente: av" + i[0] + " | ca: " + i[1]);
        
        return i;        
    }
    
}
