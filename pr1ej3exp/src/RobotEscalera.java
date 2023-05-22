
import rInfo.*;

public class RobotEscalera extends Robot{

    public RobotEscalera(int id) {
        super(id);
    }   
    
    private int tomarFlores(){
        int cant = 0;
        
        while(hayFlorEnLaEsquina()){
            tomarFlor();
            cant++ ;
        }
        
        return cant;
    }
    
    private int tomarPapeles(){
        int cant = 0;
        
        while(hayPapelEnLaEsquina()){
            tomarPapel();
            cant++ ;
        }
        
        return cant;
    }
    
    private boolean recorrerEscalon(int tamanio){
        int cantPapeles,cantFlores;
        
        
        cantPapeles = 0;
        cantFlores = 0;
        
        //recorro una linea
        for (int i = 0; i < tamanio; i++) {            
            cantPapeles += tomarPapeles();
            cantFlores += tomarFlores();
            mover();            
        }
        
        derecha();        
        
        //recorro otra linea
        for (int i = 0; i < tamanio; i++)   {         
            cantPapeles += tomarPapeles();
            cantFlores += tomarFlores();
            mover();
        }
        
        //giro a la izquierda, para empezar de vuelta
        for (int i = 0; i < 3; i++) {
            derecha();
        }

        //return= true si la cantidad de papeles supero en 1 a la cantidad de flores        
        return (cantPapeles - 1) >= cantFlores;        
    }
    
    @Override
    public void comenzar(){
        int cantCondicion = 0; // cantidad de veces que se cumple la condicion (si la cantidad de papeles supero en 1 a la cantidad de flores)
        
        //hago 8 escalones
        for (int tamanio = 1;tamanio < 8; tamanio++) {
            cantCondicion += recorrerEscalon(tamanio) ? 1 : 0; // si True = 1 , si false = 0
        }
        
        informar("cantidad de veces que se cumple la condicion: " + cantCondicion);
        
        
    }   
}
