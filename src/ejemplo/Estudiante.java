package src.ejemplo;

public class Estudiante {
    public static void main(String[] args){
        Estudiante t = new Estudiante(2, "Oliver");
        Estudiante e = new Estudiante(4, "Ernesto");
        t.mostrarDatos();
        t.setNombre("Marcos" );
        t.mostrarDatos();
        e.mostrarDatos();
    }


    private int carne;
    private String nombre;

    public Estudiante(int carne, String nombre){
        this.carne = carne;
        this.nombre = nombre;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void mostrarDatos(){
        System.out.println("NOmbre "+ nombre + " carne "+ carne);
    }
    
}
