package br.com.study.codechella.application.usecase;

import br.com.study.codechella.application.gateway.UsuarioRepository;
import br.com.study.codechella.domain.entity.usuario.Usuario;

import java.util.List;

public class UserList {

    private final UsuarioRepository repository;

    public UserList(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario () {
        return repository.listarUsuario();
    }
}
