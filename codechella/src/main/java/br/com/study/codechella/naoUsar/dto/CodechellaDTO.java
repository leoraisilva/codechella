package br.com.study.codechella.naoUsar.dto;

import java.time.LocalDateTime;
import java.util.Date;

public record CodechellaDTO(String cpf, String nome, Date dataNascimento, String email) {
}
