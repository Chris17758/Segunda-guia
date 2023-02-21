
package Herencia;

public class Gallo extends Animal {
    private String colorPlumas;
    
    public Gallo(String nombre, String alimento, int edad, String colorPlumas){
        super(nombre,alimento,edad);
        this.colorPlumas = colorPlumas;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre del Gallo: "+getNombre()+
                "\nAlimento: "+getAlimento()+"\nEdad:"+getEdad()+
                "\nColor de plumas: "+colorPlumas);
    }
}
