package br.com.study.codechella.application.gateway;

import br.com.study.codechella.domain.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario cadastrarUsuario(Usuario usuario);
    List<Usuario> listarUsuario ();

}
