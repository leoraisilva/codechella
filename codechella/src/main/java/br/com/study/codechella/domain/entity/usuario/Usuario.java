package br.com.study.codechella.domain.entity.usuario;

import br.com.study.codechella.domain.Address;

import java.time.LocalDate;

public class Usuario {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private Address address;

    public Usuario(String cpf, String nome, LocalDate dataNascimento, String email) {
        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
            throw new IllegalArgumentException("Cpf não reconhecido!!");
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
