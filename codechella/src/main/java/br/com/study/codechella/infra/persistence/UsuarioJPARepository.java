package br.com.study.codechella.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJPARepository extends JpaRepository<UsuarioEntity, String> {

}
