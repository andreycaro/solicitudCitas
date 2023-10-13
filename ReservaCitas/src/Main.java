import java.util.Date;

public class Main {
    public static <SolicitudCIta> void main(String[] args) {
        // Ejemplo de uso
        Paciente paciente = new Paciente("Andrey Caro", "9182736", "324672893");
        SolicitudCIta cita;
        cita = new SolicitudCIta(new Date ("Medicina general"));

        String citaString = cita.toString();
    }
    public void solicitarCita() {
        String motivo = getmotivo;
        String fechaHora = getfechaHora().toStiring;
        System.out.println("Solicitando una cita médica para " + fechaHora + " por el motivo: " + motivo);
}
}

