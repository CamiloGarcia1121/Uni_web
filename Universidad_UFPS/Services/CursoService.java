package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> obtenerCursos() {
        return cursoRepository.findAll();
    }

    public void agregarCurso(Curso curso) {
        cursoRepository.save(curso);
    }
}
