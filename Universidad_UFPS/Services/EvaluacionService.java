package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class EvaluacionService {
    private final EvaluacionRepository evaluacionRepository;

    public EvaluacionService(EvaluacionRepository evaluacionRepository) {
        this.evaluacionRepository = evaluacionRepository;
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluacionRepository.save(evaluacion);
    }
}