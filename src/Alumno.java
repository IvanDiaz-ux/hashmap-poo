public class Alumno {
    private String nombre;
    private int edad;
    private int curso;
    private double promedio;

    public Alumno(String nombre, int edad, int curso, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.promedio = promedio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return this.curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String toString() {
        return "Alumno{nombre='" + this.nombre + "', edad=" + this.edad + ", curso=" + this.curso + ", promedio=" + this.promedio + "}";
    }
}
