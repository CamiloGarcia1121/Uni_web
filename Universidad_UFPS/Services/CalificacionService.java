package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class CalificacionService {
    private final CalificacionRepository calificacionRepository;

    public CalificacionService(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    public void modificarCalificacion(Calificacion calificacion, double nuevaNota) {
        calificacion.setNota(nuevaNota);
        calificacionRepository.save(calificacion);
    }
}