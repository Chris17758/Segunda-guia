
package Herencia;

public class Perro extends Animal{
    private String colorPelaje;
    
    public Perro(String nombre, String alimento, int edad, String colorPelaje){
        super(nombre,alimento,edad);
        this.colorPelaje = colorPelaje;
    }
     public void mostrarDatos(){
        System.out.println("Nombre del Perro: "+getNombre()+
                "\nAlimento: "+getAlimento()+"\nEdad:"+getEdad()+
                "\nColor de pelaje: "+colorPelaje);
    }

}
