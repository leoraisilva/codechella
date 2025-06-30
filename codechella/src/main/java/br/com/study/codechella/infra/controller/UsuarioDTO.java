package br.com.study.codechella.infra.controller;

import java.time.LocalDate;

public record UsuarioDTO(String cpf, String nome, LocalDate dataNascimento, String email) {
}
