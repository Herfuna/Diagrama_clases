package Java.Progra1.fuchibol;

public class entrador extends Persona{

    public entrador(String name, String nacionalidad, int edad) {
        super(name, nacionalidad, edad);
        //TODO Auto-generated constructor stub
    }
    private int experiencia;
    private String tactica;
    public entrador(String name, String nacionalidad, int edad, int experiencia, String tactica) {
        super(name, nacionalidad, edad);
        this.experiencia = experiencia;
        this.tactica = tactica;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public String getTactica() {
        return tactica;
    }
    public void entrenadorinfo(){
        System.out.println("El entrenador, "+ getName()+ " tiene "+getExperiencia()+ " años de experiencia por lo cual su tactica es: "+ getTactica());

    }
}
