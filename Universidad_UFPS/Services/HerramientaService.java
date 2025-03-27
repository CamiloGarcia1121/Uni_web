package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class HerramientaService {
    private final HerramientaRepository herramientaRepository;

    public HerramientaService(HerramientaRepository herramientaRepository) {
        this.herramientaRepository = herramientaRepository;
    }

    public void registrarHerramienta(Herramienta herramienta) {
        herramientaRepository.save(herramienta);
    }
}
