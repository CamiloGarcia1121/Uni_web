import java.util.List;

public class HistorialAcademico {
    private List<String> calificaciones;
    
    public HistorialAcademico(List<String> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<String> getCalificaciones() { return calificaciones; }
    public void setCalificaciones(List<String> calificaciones) { this.calificaciones = calificaciones; }
}