
package Herencia;

public class Hamster extends Animal {
    private String cantidadPulgas;
    
    public Hamster(String nombre, String alimento, int edad, String cantidadPulgas){
        super(nombre,alimento,edad);
        this.cantidadPulgas = cantidadPulgas;
    }
     public void mostrarDatos(){
        System.out.println("Nombre del Hamster: "+getNombre()+
                "\nAlimento: "+getAlimento()+"\nEdad:"+getEdad()+
                "\nCantidad de pulgas: "+cantidadPulgas);
    }
}
