package Services;

import Model.Usuario;
import Repository.UsuarioRepository;
import java.util.List;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}

