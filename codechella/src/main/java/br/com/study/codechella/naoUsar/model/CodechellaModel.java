package br.com.study.codechella.naoUsar.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class CodechellaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String usuarioId;
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    public CodechellaModel(String usuarioId, String cpf, String nome, LocalDate dataNascimento, String email) {
        this.usuarioId = usuarioId;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public CodechellaModel() {}

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
