//Ivan Camilo Diaz Rodriguez ID:935388//
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        HashMap<Integer, Alumno> alumnos = new HashMap();
        alumnos.put(1, new Alumno("Ivan Camilo Diaz", 17, 11, 3.0));
        alumnos.put(2, new Alumno("María Antonia Sanchez", 16, 11, 4.2));
        alumnos.put(3, new Alumno("Alejandra Nieto", 15, 11, 4.5));
        alumnos.put(4, new Alumno("Juan Rodríguez", 21, 11, 3.3));
        alumnos.put(5, new Alumno("Luis Garcia", 23, 11, 4.8));
        Scanner scanner = new Scanner(System.in);

        int opcion;
        label34:
        do {
            System.out.println("\n--- Sistema de Gestión de Alumnos ---");
            System.out.println("1. Ver datos de el alumno");
            System.out.println("2. Ver todos los alumnos");
            System.out.println("3. Agregar un nuevo alumno");
            System.out.println("4. Remover un alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el numero del alumno: ");
                    int numero = scanner.nextInt();
                    if (alumnos.containsKey(numero)) {
                        System.out.println("Datos del alumno:");
                        System.out.println(alumnos.get(numero));
                    } else {
                        System.out.println("No se encontró un alumno con ese numero.");
                    }
                    break;
                case 2:
                    System.out.println("\nLista de todos los alumnos:");
                    Iterator var11 = alumnos.keySet().iterator();

                    while(true) {
                        if (!var11.hasNext()) {
                            continue label34;
                        }

                        Integer key = (Integer)var11.next();
                        System.out.println("numero: " + key + " - " + String.valueOf(alumnos.get(key)));
                    }
                case 3:
                    System.out.print("\nIngrese el numero del nuevo alumno: ");
                    int nuevoNumero = scanner.nextInt();
                    if (alumnos.containsKey(nuevoNumero)) {
                        System.out.println("Ya existe un alumno con ese numero.");
                    } else {
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del alumno: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese el grado del alumno: ");
                        int curso = scanner.nextInt();
                        System.out.print("Ingrese el promedio del alumno: ");
                        double promedio = scanner.nextDouble();
                        alumnos.put(nuevoNumero, new Alumno(nombre, edad, curso, promedio));
                        System.out.println("Alumno agregado con éxito.");
                    }
                    break;
                case 4:
                    System.out.print("\nIngrese el Numero del alumno a remover: ");
                    int alumnoRemover = scanner.nextInt();
                    if (alumnos.containsKey(alumnoRemover)) {
                        alumnos.remove(alumnoRemover);
                        System.out.println("Alumno removido con éxito.");
                    } else {
                        System.out.println("No se encontró un alumno con ese ID.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while(opcion != 5);

        scanner.close();
    }
}
