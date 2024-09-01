package Week01;

public class Persona {
    private String nombre;
    private int edad;

    public static void main(String[] args){
        Persona persona1 = new Persona("Diego", 19);
        persona1.Saludar();
        persona1.setNombre("Juan");
        persona1.setEdad(23);
        System.out.println("Tu nombre es " + persona1.getNombre() + " y tu edad es " + persona1.getEdad());
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Saludar(){
        System.out.println("Tu nombre es " + nombre + " y  tu edad es " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Principios de POO