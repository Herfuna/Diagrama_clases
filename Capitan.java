package Java.Progra1.fuchibol;
//clase hija que implemente futbolistas
public class Capitan implements Futbolistas{
    private String nombre;

    public Capitan(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void animos() {
        System.out.println("el capitan "+ getNombre()+ " motiva a los jugaores");
        
    }

    @Override
    public void entrenar() {
        
        System.out.println("el capitan "+ getNombre()+ " pide a los jugadores entrenar");
    }

    public String getNombre() {
        return nombre;
    }
    
}
