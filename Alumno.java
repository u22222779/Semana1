import java.util.Arrays;
public class Alumno extends Persona{
    private double[] calificaciones;

    //constructor
    public Alumno(String nombre, int edad, double[] calificaciones) {
        super(nombre, edad);
        this.calificaciones = calificaciones;
    }
    
    //metodo para calcular el promedio
    public double promedio() {
        double suma =0;
        for(double calificacion: calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    //metodo informacion
    public void Informacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Promedio: " + promedio());
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
    }
}
