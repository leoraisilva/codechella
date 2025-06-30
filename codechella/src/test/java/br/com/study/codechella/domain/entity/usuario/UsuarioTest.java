package br.com.study.codechella.domain.entity.usuario;

import br.com.study.codechella.domain.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void erroNoCadastroCPF(){
        //Assert
        IllegalArgumentException jacque = Assertions.assertThrows(IllegalArgumentException.class,() ->
                    new Usuario("12345678900", "Jacque", LocalDate.parse("1990-09-09"), "jacque@exemplo.com")
        ,"Deveria lançar IllegalArgumentException ao receber CPF em formato inválido");
    }

    @Test
    public void cadastroCPFCerto() {
        //Arrange
        var usuario = new Usuario("123.456.789-00", "Jacque", LocalDate.parse("1990-09-09"), "jacque@exemplo.com");
        //Assert
        Assertions.assertEquals("123.456.789-00", usuario.getCpf());
        Assertions.assertEquals(usuario.getNome(), "Jacque");
        Assertions.assertEquals(usuario.getDataNascimento(), LocalDate.parse("1990-09-09"));
        Assertions.assertEquals(usuario.getEmail(), "jacque@exemplo.com");
    }

    @Test
    public void testandoFactoryUsuario() {
        //Arrange
        var usuarioFactory = new UsuarioFactory();
        var usuario = usuarioFactory.withNomeCPFNascimento("123.456.789-00", "Jacque", LocalDate.parse("1990-09-09"));
        //Assert
        Assertions.assertEquals(usuario.getCpf(), "123.456.789-00");
        Assertions.assertEquals(usuario.getNome(), "Jacque");
        Assertions.assertEquals(usuario.getDataNascimento(), LocalDate.parse("1990-09-09"));
    }

    @Test
    public void testandoFactoryUsuarioAddress() {
        //Arrange
        var usuarioFactory = new UsuarioFactory();
        var usuario = usuarioFactory.withNomeCPFNascimento("123.456.789-00", "Jacque", LocalDate.parse("1990-09-09"));
        var endereco = new Address("13216300", 13, "");
        usuario = usuarioFactory.includeAddress(endereco.getCep(), endereco.getNumber(), endereco.getComplement());
        //Assert
        Assertions.assertEquals(endereco.getCep(), usuario.getAddress().getCep());
        Assertions.assertEquals(endereco.getNumber(), usuario.getAddress().getNumber());
        Assertions.assertEquals(endereco.getComplement(), usuario.getAddress().getComplement());
    }

}
