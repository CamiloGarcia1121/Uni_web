package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;


public class RecursoAcademicoService {
    private final RecursoAcademicoRepository recursoRepository;

    public RecursoAcademicoService(RecursoAcademicoRepository recursoRepository) {
        this.recursoRepository = recursoRepository;
    }

    public void agregarRecurso(RecursoAcademico recurso) {
        recursoRepository.save(recurso);
    }
}