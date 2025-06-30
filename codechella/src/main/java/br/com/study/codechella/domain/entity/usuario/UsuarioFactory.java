package br.com.study.codechella.domain.entity.usuario;

import br.com.study.codechella.domain.Address;

import java.time.LocalDate;

public class UsuarioFactory {
    private Usuario usuario;

    public Usuario withNomeCPFNascimento (String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(nome, cpf, nascimento, "");
        return usuario;
    }

    public Usuario includeAddress (String cep, Integer number, String complement) {
        this.usuario.setAddress(new Address(cep, number, complement));
        return usuario;
    }
}
