package br.com.study.codechella.infra.gateway;

import br.com.study.codechella.domain.entity.usuario.Usuario;
import br.com.study.codechella.application.gateway.UsuarioRepository;
import br.com.study.codechella.infra.persistence.UsuarioJPARepository;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioJPAImplRepository implements UsuarioRepository {

    private final UsuarioJPARepository repository;
    private final UsuarioEntityMapper mapper;

    public UsuarioJPAImplRepository(UsuarioJPARepository repository, UsuarioEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return mapper.toDomain(repository.save(mapper.toEntity(usuario)));
    }

    @Override
    public List<Usuario> listarUsuario() {
        return repository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
