package br.com.study.codechella.naoUsar.service;

import br.com.study.codechella.naoUsar.repository.CodechellaRepository;
import org.springframework.stereotype.Service;

@Service
public class CodechellaService {
    private final CodechellaRepository repository;

    public CodechellaService(CodechellaRepository repository) {
        this.repository = repository;
    }

    public CodechellaRepository getRepository() {
        return repository;
    }
}
