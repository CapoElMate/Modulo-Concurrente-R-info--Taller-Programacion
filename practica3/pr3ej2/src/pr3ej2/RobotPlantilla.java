package pr3ej2;
import rInfo.*;

public abstract class RobotPlantilla extends Robot {

    public int cantElementos;
    
    public RobotPlantilla(int id) {
        super(id);
        cantElementos = 0;
    }
    
    
    public abstract int juntar();//metodo juntar. depende del tipo de robot junta flores o papeles
    
    public void izquierda(){//gira a la izq. 
        for (int i = 0; i < 3; i++) {
            derecha();
        }
    }
    
    //recorre una linea
    public int linea(int dist){
        int cant = 0;
        
        for (int i = 0; i < dist; i++) {
            cant += juntar();   
            mover();
        }
                
        return cant;
    }
    
    //recorre en la forma de escalon girando a la derecha
    public int escalonDerecha(int dist){
        int cant = 0;
        
        cant += linea(dist);
        derecha();
        cant += linea(dist);
        
        izquierda();
        
        return cant;
    }
    
    
    //recorre en la forma de escalon girando a la izquierda
    public int escalonIzquierda(int dist){
        int cant = 0;
        
        cant += linea(dist);
        
        izquierda();
        
        cant += linea(dist);
        
        derecha();
        
        return cant;
    }
    
    
    
    
}
