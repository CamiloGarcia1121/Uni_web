package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class AulaService {
    private final AulaRepository aulaRepository;

    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    public void asignarAula(Aula aula) {
        aulaRepository.save(aula);
    }
}
