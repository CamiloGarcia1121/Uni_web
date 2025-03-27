package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class AsignaturaService {
    private final AsignaturaRepository asignaturaRepository;

    public AsignaturaService(AsignaturaRepository asignaturaRepository) {
        this.asignaturaRepository = asignaturaRepository;
    }

    public void registrarAsignatura(Asignatura asignatura) {
        asignaturaRepository.save(asignatura);
    }
}

