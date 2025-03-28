import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String aficion;
    private String objetivo;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.aficion = "";
        this.objetivo = "";
    }

    // Método para saludar
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + ", y tengo " + edad + " años.");
    }

    // Método para agregar afición y objetivo mediante entrada de texto
    public void agregarPorTexto(Scanner texto) {
        System.out.print("Ingresa tu afición: ");
        this.aficion = texto.nextLine();
        System.out.print("Ingresa tu objetivo: ");
        this.objetivo = texto.nextLine();
    }

    // Método presentación
    public void presentacion() {
        System.out.println("Mis aficiones son " + aficion + ", y mi objetivo es " + objetivo + ".");
    }

    // Método para verificar la mayoría de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }
    // Método main para probar
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Persona persona1 = new Persona("Gadiel", 20);
        
        persona1.agregarPorTexto(texto);
        persona1.saludar();
        persona1.presentacion();
        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());

        texto.close();
    }
}
