package br.com.study.codechella.infra.gateway;

import br.com.study.codechella.domain.entity.usuario.Usuario;
import br.com.study.codechella.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {
    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getDataNascimento(), usuario.getEmail());
    }
    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getCpf(), usuarioEntity.getNome(), usuarioEntity.getDataNascimento(), usuarioEntity.getEmail());
    }
}
