package br.com.study.codechella.naoUsar.repository;

import br.com.study.codechella.naoUsar.model.CodechellaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodechellaRepository extends CrudRepository<CodechellaModel, String> {
}
