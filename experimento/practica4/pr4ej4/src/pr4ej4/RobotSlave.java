
package pr4ej4;
import rInfo.*;


public class RobotSlave extends Robot{

    public RobotSlave(int id) {
        super(id);
    }

    
    @Override
    public void comenzar() {
        Mensaje m;
        
        m = recibirMensaje("master");
        int av,ca;
        int avIni = posAv();
        int caIni = posCa();
        
        // el mensaje 4 significa FIN
        while(m.getMensajeInt() != 4){
            av = recibirMensaje("master").getMensajeInt();
            ca = recibirMensaje("master").getMensajeInt();

            bloquearEsquina(av,ca);
            pos(av,ca);
            
            //vueltas(100);//ignorar. solo lo hice para que vaya mas lento y se pueda apreciar lo que hace cada robot.
            
            switch (m.getMensajeInt()){
                                
                case 1:
                    recogerFlores();
                    System.out.println("recoger F");
                    break;
                
                case 2:
                    recogerPapeles();
                    System.out.println("recoger P");
                    break;
                
                case 3:
                    vaciarBolsa();
                    System.out.println("vacio mi bolsa");
                    break;
                                        
                //en caso de que no sea ninguno de los 4
                default:
                    System.out.println("error!");
                    break;
            }
            
            pos(avIni,caIni);
            liberarEsquina(av,ca);            
            
            enviarMensaje("master", "fin");
            m = recibirMensaje("master");
        }
        
        
    }
    
    private void vueltas(int cant){
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < 400; j++) {
                derecha();
            }
        }
    }
    
    public void recogerFlores(){
        while(hayFlorEnLaEsquina())
            tomarFlor();
    }
    
    public void recogerPapeles(){
        while(hayPapelEnLaEsquina())
            tomarPapel();
    }
    
    public void vaciarBolsa(){
        
        while(hayPapelEnLaBolsa())
            depositarPapel();
        
        while(hayFlorEnLaBolsa())
            depositarFlor();
        
    }
    
    
    

}
