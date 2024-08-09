package Java.Progra1.fuchibol;

public class Persona {
    private String name;
    private String nacionalidad;
    private int edad;
    public Persona(String name, String nacionalidad, int edad) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
