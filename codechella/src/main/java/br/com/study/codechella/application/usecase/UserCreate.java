package br.com.study.codechella.application.usecase;

import br.com.study.codechella.domain.entity.usuario.Usuario;
import br.com.study.codechella.application.gateway.UsuarioRepository;

public class UserCreate {
    private final UsuarioRepository repository;

    public UserCreate(UsuarioRepository repository) {
        this.repository = repository;
    }
    public Usuario cadastrarUsuario (Usuario usuario) {
        return repository.cadastrarUsuario(usuario);
    }
}
