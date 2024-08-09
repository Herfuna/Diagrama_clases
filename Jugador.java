package Java.Progra1.fuchibol;

public class Jugador extends Persona {
    public Jugador(String name, String nacionalidad, int edad) {
        super(name, nacionalidad, edad);
        
    }
    private String posicion;
    private int dorsal;
  
    public Jugador(String name, String nacionalidad, int edad, String posicion, int dorsal, boolean esCapitan) {
        super(name, nacionalidad, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
      
    }
    public String getPosicion() {
        return posicion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
   

    public void JugadoresP(){
        System.out.println("El jugador "+ getName() + " con nacionalidad "+ getNacionalidad()+ " tendra el dorsal " +getDorsal()+ " y jugara como: "+ getPosicion());
    }
 
    

}
