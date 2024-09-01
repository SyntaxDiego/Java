package Week01;

public class Animal {
    private String nombre;
    private int edad;
    public static void main(String[] args){}

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

class Perro extends Animal{
    public static void main(String[] args){
        Perro perro1 = new Perro("Tobi", 5);
        System.out.println("El perro " + perro1.getNombre() + " tiene la edad de " + perro1.getEdad());
        perro1.hacerSonido();
        Gato gato1 = new Gato("Tomi", 6);
        System.out.println("El gato " + gato1.getNombre() + " tiene la edad de " + gato1.getEdad());
        gato1.hacerSonido();
    }
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public void hacerSonido(){
        System.out.println("Guau");
    }
}

class Gato extends Animal{
    public static void main(String[] args){
    }
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    public void hacerSonido(){
        System.out.println("Meow");
    }
}