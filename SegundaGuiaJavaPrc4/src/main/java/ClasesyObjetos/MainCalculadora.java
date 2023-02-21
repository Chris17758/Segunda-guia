
package ClasesyObjetos;

public class MainCalculadora {
    public static void main(String [] args){
        CalculadoraBasica cb = new CalculadoraBasica();
        
        cb.leerNumeros();
        cb.sumar();
        cb.restar();
        cb.multiplicar();
        cb.dividir();
        cb.mostrarResultador();
    }
    
}
