import java.util.Date;

public class SolicitudCIta implements Reserva {

    private Date fechaHora;
    private String motivo;

    public SolicitudCIta(Date fechaHora, String motivo) {
        this.fechaHora = fechaHora;
        this.motivo = motivo;

    }
    @Override
    public void realizarReserva() {
        System.out.println("Cita médica reservada para " + fechaHora + " por el motivo: " + motivo);
    }
    public void solicitarCita() {
        System.out.println("Cita para el paciente" + fechaHora + "Motivo" + motivo);

    }
}
