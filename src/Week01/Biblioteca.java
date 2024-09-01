package Week01;

public class Biblioteca {
    private String nombre;
    private int año;

    public Biblioteca(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

class Libro extends Biblioteca {
    private boolean estado_libro;

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cuento01", 1985, true);
        libro1.prestar();
    }

    public Libro(String nombre, int año, boolean estado_libro) {
        super(nombre, año);
        this.estado_libro = estado_libro;
    }

    public void prestar() {
        if (estado_libro == true) {
            System.out.println("El libro se encuentra prestado");
        } else {
            System.out.println("El libro se encuentra disponible para el prestamo");
        }
    }
}

class Revista extends Biblioteca {
    private boolean estado_libro;

    public static void main(String[] args) {
        Revista revista1 = new Revista("revista_semana", 2014, false);
        revista1.prestar();
    }

    public Revista(String nombre, int año, boolean estado_libro) {
        super(nombre, año);
        this.estado_libro = estado_libro;
    }

    public void prestar() {
        if (estado_libro == true) {
            System.out.println("La revista se encuentra prestada");
        } else {
            System.out.println("La revista se encuentra disponible para el prestamo");
        }
    }
}
