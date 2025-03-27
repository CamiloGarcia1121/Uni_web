package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class DocenteService {
    private final DocenteRepository docenteRepository;

    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public void asignarCalificacion(Docente docente, Estudiante estudiante, Calificacion calificacion) {
        docente.asignarCalificacion(estudiante, calificacion);
    }
}
