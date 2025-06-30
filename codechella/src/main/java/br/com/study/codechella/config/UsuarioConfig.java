package br.com.study.codechella.config;

import br.com.study.codechella.application.gateway.UsuarioRepository;
import br.com.study.codechella.application.usecase.UserCreate;
import br.com.study.codechella.application.usecase.UserList;
import br.com.study.codechella.infra.gateway.UsuarioEntityMapper;
import br.com.study.codechella.infra.gateway.UsuarioJPAImplRepository;
import br.com.study.codechella.infra.persistence.UsuarioJPARepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    UserCreate  userCreate(UsuarioRepository usuarioRepository) {
        return new UserCreate(usuarioRepository);
    }

    @Bean
    UsuarioJPAImplRepository usuarioJPAImplRepository(UsuarioJPARepository usuarioJPARepository, UsuarioEntityMapper usuarioEntityMapper) {
        return new UsuarioJPAImplRepository(usuarioJPARepository, usuarioEntityMapper);
    }

    @Bean
    UsuarioEntityMapper usuarioEntityMapper () {
        return new UsuarioEntityMapper();
    }

    @Bean
    UserList userList(UsuarioRepository usuarioRepository){
        return new UserList(usuarioRepository);
    }

}