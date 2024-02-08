import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private String getmotivo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ejemplo de uso


        // Solicitar datos del paciente al usuario
        System.out.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        System.out.println("Ingrese el documento del paciente: ");
        String documentoPaciente = scanner.nextLine();
        System.out.println("Ingrese el número de contacto del paciente: ");
        String numeroContactoPaciente = scanner.nextLine();

        Paciente paciente = new Paciente(nombrePaciente, documentoPaciente, numeroContactoPaciente);


        // Mostrar los datos del paciente
        System.out.println("\nDatos del paciente:");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Documento: " + paciente.getDocumento());
        System.out.println("Número de contacto: " + paciente.getNumeroContacto());

        // Solicitar datos de la cita al usuario
        System.out.println("Ingrese la fecha y hora de la cita (yyyy-MM-dd HH:mm:ss): ");
        String fechaHoraString = scanner.nextLine();
        System.out.println("Ingrese el motivo de la cita: ");
        String motivo = scanner.nextLine();

        // Convertir la cadena de fecha y hora a un objeto Date
        Date fechaHora = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fechaHora = formatter.parse(fechaHoraString);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha y hora. Se usará la fecha y hora actual.");
            fechaHora = new Date(); // Si hay un error, se utiliza la fecha y hora actual
        }

        // Crear instancia de SolicitudCita
        SolicitudCIta cita = new SolicitudCIta(fechaHora, motivo);

        // Mostrar la información de la cita
        cita.solicitarCita();

        scanner.close();
    }
}

