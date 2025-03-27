package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class MensajeService {
    private final MensajeRepository mensajeRepository;

    public MensajeService(MensajeRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }

    public void enviarMensaje(Mensaje mensaje) {
        mensajeRepository.save(mensaje);
    }
}

