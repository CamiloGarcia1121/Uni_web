import java.util.Date;

public class Mensaje {
    private String contenido;
    private Date fechaEnvio;

    public Mensaje(String contenido, Date fechaEnvio) {
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public Date getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Date fechaEnvio) { this.fechaEnvio = fechaEnvio; }
}