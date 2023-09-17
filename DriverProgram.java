import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Fecha de finalizacion: 16/9/2023
 * Clase principal que se encarga de cargar y visualizar información sobre salones y cursos desde archivos CSV.
 * También proporciona una interfaz de usuario simple para interactuar con esta información.
 */

public class DriverProgram {
    /**
     * Punto de entrada principal para la aplicación.
     * 
     * @param args Argumentos de línea de comando (no se utilizan).
     */
    public static void main(String[] args) {
        // Mapa de sedes donde la clave es el ID de la sede y el valor es el objeto Sede.
        HashMap<Integer, Sede> sedes = new HashMap<>();
        // Lista que almacena los cursos leídos desde el archivo CSV.
        ArrayList<Curso> cursos = new ArrayList<>();

        // Cargar archivo de salones
        try (BufferedReader br = new BufferedReader(new FileReader("Salones.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id_sede = Integer.parseInt(data[0]);
                String edificioNombre = data[1];
                int id_salon = Integer.parseInt(data[2]);
                int capacidad = Integer.parseInt(data[3]);
                int nivel = Integer.parseInt(data[4]);

                Sede sede = sedes.get(id_sede);
                if (sede == null) {
                    sede = new Sede(id_sede);
                    sedes.put(id_sede, sede);
                }

                // Buscar el edificio en la sede
                Edificio edificio = null;
                for (Edificio e : sede.getEdificios()) {
                    if (e.getNombre().equals(edificioNombre)) {
                        edificio = e;
                        break;
                    }
                }

                if (edificio == null) {
                    edificio = new Edificio(edificioNombre);
                    sede.agregarEdificio(edificio);
                }

                Salon salon = new Salon(id_salon, capacidad, nivel, edificioNombre);
                edificio.agregarSalon(salon);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de salones.");
        }

        // Cargar archivo de cursos
        try (BufferedReader br = new BufferedReader(new FileReader("Cursos.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                String idCurso = data[0];
                int idSede = Integer.parseInt(data[1]);
                String nombreCurso = data[2];
                String horario = data[3];
                String duracion = data[4];
                String dias = data[5];
                int cantidadEstudiantes = Integer.parseInt(data[6]);

                Curso curso = new Curso(idCurso, nombreCurso, horario, duracion, dias, cantidadEstudiantes, idSede);
                cursos.add(curso);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de cursos.");
        }

        // Menú principal
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar información de Salones.");
            System.out.println("2. Mostrar información de Cursos.");
            System.out.println("3. Salir.");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (Sede sede : sedes.values()) {
                        System.out.println("Sede: " + sede.getIdSede());
                        for (Edificio edificio : sede.getEdificios()) {
                            System.out.println("\tEdificio: " + edificio.getNombre());
                            for (Salon salon : edificio.getSalones()) {
                                System.out.println("\t\tSalón Número: " + salon.getNumero());
                                System.out.println("\t\tCapacidad: " + salon.getCapacidad());
                            }
                        }
                    }
                    break;
                case 2:
                    for (Curso curso : cursos) {
                        System.out.println("ID: " + curso.getId());
                        System.out.println("Nombre: " + curso.getNombre());
                        System.out.println("Sede: " + curso.getSede());
                        System.out.println("Horario: " + curso.getHorario());
                        System.out.println("Duracion: " + curso.getDuracion());
                        System.out.println("Dias: " + curso.getDias());
                        System.out.println("Estudiantes: " + curso.getCantidadEstudiantes());
                        System.out.println("------");
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}


