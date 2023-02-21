
package Herencia;

public class Principal {
    public static void main(String [] args){
        Gallo gallo = new Gallo("fenec","maiz",5,"rojo,azul\n");
        Perro perro = new Perro("fenec","dogshow",2,"cafe\n");
        Gato gato = new Gato("fenec","wiska",3,"blanco\n");
        Hamster hamster = new Hamster("fenec","agua",1,"cafe,blanco\n");
        
        gallo.mostrarDatos();
        perro.mostrarDatos();
        gato.mostrarDatos();
        hamster.mostrarDatos();
    }
}
