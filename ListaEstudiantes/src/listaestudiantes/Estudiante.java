
package listaestudiantes;

public class Estudiante {
    
    //Aributos
    String nombre;
    String apellido;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
    
    //Método constructor
    
    public Estudiante(String nombre, String apellido, double nota1, double nota2, double nota3, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }
  
    
    //Métodos Setter Y Getter... No són necesarios
    //Metodo ToString si, para imprimir información

    @Override
    public String toString() {
        String informacion = "\n"+
                this.nombre+"       |       "+this.apellido+"       |       "+this.nota1+"       |       "+this.nota2+"       |       "+this.nota3+"       |       "+this.promedio+"  "
                             +"\n";
        
        return informacion;
    }
    
    
    
}
