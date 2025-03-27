package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class HistorialAcademicoService {
    private final HistorialAcademicoRepository historialRepository;

    public HistorialAcademicoService(HistorialAcademicoRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    public List<HistorialAcademico> obtenerHistorialPorEstudiante(Estudiante estudiante) {
        return historialRepository.findByEstudiante(estudiante);
    }
}


