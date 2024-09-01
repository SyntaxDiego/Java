package Week01;

public class Estudiante extends Persona{
    private String curso;

    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Diego", 19, "Programacion");
        estudiante1.Estudiar();
    }

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void Estudiar(){
        System.out.println("Tu nombre es " + getNombre() + " tu edad es " + getEdad() + " y  tu curso es " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

//Herencia estudiante