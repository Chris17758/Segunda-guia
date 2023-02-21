
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Alumno {
    //Atributos
    String M1,M2,M3,M4,M5;
    String nombre;
    String apellido;
    int edad;
    
    public void leerDatosEstudiante(){
        nombre=JOptionPane.showInputDialog("Digite su nombre: ");
        apellido=JOptionPane.showInputDialog("Digite su apellido: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
    }
        public void leerMaterias(){
        M1=JOptionPane.showInputDialog("Digite la primera materia: ");
        M2=JOptionPane.showInputDialog("Digite la segunda materia: ");
        M3=JOptionPane.showInputDialog("Digite la tercera materia: ");
        M4=JOptionPane.showInputDialog("Digite la cuarta materia: ");
        M5=JOptionPane.showInputDialog("Digite la quinta materia: ");
    }
    public void mostrarDatos(){
        System.out.println("Nombre del alumno: "+nombre);
        System.out.println("Apellido del alumno: "+apellido);
        System.out.println("Edad del alumno: "+edad);
        System.out.println("Sus materias inscritas son: "+M1+M2+M3+M4+M5);
    }
}
