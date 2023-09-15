import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que se encarga de cargar los datos desde un archivo CSV y crear los objetos correspondientes en el programa.
 */

public class CargarArchivo {
    private String rutaArchivo; // Ruta del archivo a cargar

    /**
     * Constructor de la clase CargarArchivo.
     *
     * @param rutaArchivo Ruta del archivo a cargar.
     */
    public CargarArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * Método que carga los datos desde el archivo CSV y crea los objetos correspondientes en el programa.
     *
     * @return Lista de sedes creadas a partir del archivo CSV.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public List<Sede> cargarDatos() throws IOException {
        List<Sede> sedes = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");

            // Se verifica el tipo de objeto a crear según el valor de la primera columna
            switch (datos[0]) {
                case "sede":
                    int idSede = Integer.parseInt(datos[1]);
                    Sede sede = new Sede(idSede);
                    sedes.add(sede);
                    break;
                case "edificio":
                    String nombreEdificio = datos[1];
                    int idSedeEdificio = Integer.parseInt(datos[2]);
                    Edificio edificio = new Edificio(nombreEdificio);
                    for (Sede s : sedes) {
                        if (s.getIdSede() == idSedeEdificio) {
                            s.agregarEdificio(edificio);
                            break;
                        }
                    }
                    break;
                case "salon":
                    int numeroSalon = Integer.parseInt(datos[1]);
                    int capacidadSalon = Integer.parseInt(datos[2]);
                    int idEdificioSalon = Integer.parseInt(datos[3]);
                    Salon salon = new Salon(numeroSalon, capacidadSalon);
                    for (Sede s : sedes) {
                        for (Edificio e : s.getEdificios()) {
                            if (e.getNombre().equals(datos[4]) && e.getIdEdificio() == idEdificioSalon) {
                                e.agregarSalon(salon);
                                break;
                            }
                        }
                    }
                    break;
                case "curso":
                    String codigoCurso = datos[1];
                    String nombreCurso = datos[2];
                    int creditosCurso = Integer.parseInt(datos[3]);
                    Curso curso = new Curso(codigoCurso, nombreCurso, creditosCurso);
                    for (Sede s : sedes) {
                        for (Edificio e : s.getEdificios()) {
                            for (Salon sal : e.getSalones()) {
                                if (sal.getNumero() == Integer.parseInt(datos[4])) {
                                    sal.agregarCurso(curso);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        br.close();

        return sedes;
    }
}
