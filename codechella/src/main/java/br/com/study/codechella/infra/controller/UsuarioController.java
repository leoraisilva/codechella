package br.com.study.codechella.infra.controller;

import br.com.study.codechella.application.usecase.UserList;
import br.com.study.codechella.domain.entity.usuario.Usuario;
import br.com.study.codechella.application.usecase.UserCreate;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    private final UserCreate criar;
    private final UserList listar;

    public UsuarioController(UserCreate criar, UserList listar) {
        this.criar = criar;
        this.listar = listar;
    }

    @PostMapping
    public UsuarioDTO cadastrarUsuario(@RequestBody @Valid UsuarioDTO usuariodto) {
        var usuario = criar.cadastrarUsuario(new Usuario(usuariodto.cpf(), usuariodto.nome(), usuariodto.dataNascimento(), usuariodto.email()));
        return new UsuarioDTO(usuario.getCpf(), usuario.getNome(), usuario.getDataNascimento(), usuario.getEmail());
    }

    @GetMapping
    private List<UsuarioDTO> listarUsuario () {
        return listar.listarUsuario().stream()
                .map(usuario -> new UsuarioDTO(
                        usuario.getCpf(),
                        usuario.getNome(),
                        usuario.getDataNascimento(),
                        usuario.getEmail()
                ))
                .collect(Collectors.toList());
    }

}
