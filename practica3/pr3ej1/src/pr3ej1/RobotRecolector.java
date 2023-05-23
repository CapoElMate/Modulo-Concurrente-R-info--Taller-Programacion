
package pr3ej1;
import rInfo.*;
import java.util.Random;

public abstract class RobotRecolector extends Robot {

    //preguntar si esta bien poner las variables aqui
    private Random rnd = new Random(); // generador random
    
    private int avRnd,caRnd;
    private int avMin,caMin,avMax,caMax;//rangos de recoleccion
    
    private int avInicial,caInicial;

    private int intentos;

    private int cant;
    
    public RobotRecolector(int id,int avMin, int caMin, int avMax, int caMax,int intentos) {
        super(id);
        this.avMin = avMin;
        this.caMin = caMin;
        this.avMax = avMax;
        this.caMax = caMax;
        this.intentos = intentos;
        
        cant = 0;
    }
        
    

    
    @Override
    public void comenzar() {      
        
        for (int i = 0; i < intentos; i++) {
            avRnd = rnd.nextInt(avMax-avMin) + avMin;
            caRnd = rnd.nextInt(caMax-caMin) + caMin;
            
            avInicial = posAv();
            caInicial = posCa();
            
            bloquearEsquina(avRnd, caRnd);
            pos(avRnd, caRnd);
            
            cant += limpiarEsquina();         
            
            pos(avInicial,caInicial);            
            liberarEsquina(avRnd,caRnd);
        }
        
        for (int i = 0; i < cant; i++) {
            bloquearEsquina(10,10);
            pos(10,10);
            
            depositar();         
            
            pos(avInicial,caInicial);
            liberarEsquina(10,10);
        }
        
    }
    
    public abstract void depositar();
    
    public abstract int limpiarEsquina();

    
    
}
