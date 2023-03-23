package sv.edu.utec.ejercicio01_guia04_diegoceron2516252019;

public class Persona {

    public Persona(String nombre, char genero) {
        this.nombre=nombre;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    private String nombre;
    private char genero;

}
