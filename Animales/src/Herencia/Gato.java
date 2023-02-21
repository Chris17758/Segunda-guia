
package Herencia;

public class Gato extends Animal {
    private String colorOjos;
    
    public Gato(String nombre, String alimento, int edad, String colorOjos){
        super(nombre,alimento,edad);
        this.colorOjos = colorOjos;
    }
     public void mostrarDatos(){
        System.out.println("Nombre del Gato: "+getNombre()+
                "\nAlimento: "+getAlimento()+"\nEdad:"+getEdad()+
                "\nColor de ojos: "+colorOjos);
    }
}
