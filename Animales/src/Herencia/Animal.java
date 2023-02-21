
package Herencia;

public class Animal {
    private String nombre;
    private String alimento;
    private int edad;

    public Animal(String nombre, String alimento, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
