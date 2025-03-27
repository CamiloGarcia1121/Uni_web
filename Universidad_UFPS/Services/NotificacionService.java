package Services;

import Model.Curso;
import Repository.CursoRepository;
import java.util.List;

public class NotificacionService {
    private final NotificacionRepository notificacionRepository;

    public NotificacionService(NotificacionRepository notificacionRepository) {
        this.notificacionRepository = notificacionRepository;
    }

    public void enviarNotificacion(Notificacion notificacion) {
        notificacionRepository.save(notificacion);
    }
}
