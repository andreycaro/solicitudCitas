public class Paciente {
    private String nombre;
    private String documento;
    private String numeroContacto;

    public Paciente(String nombre, String documento, String numeroContacto) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }
}
