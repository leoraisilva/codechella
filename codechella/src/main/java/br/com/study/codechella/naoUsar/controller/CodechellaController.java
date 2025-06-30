package br.com.study.codechella.naoUsar.controller;

import br.com.study.codechella.naoUsar.dto.CodechellaDTO;
import br.com.study.codechella.naoUsar.model.CodechellaModel;
import br.com.study.codechella.naoUsar.service.CodechellaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/codechella")
@CrossOrigin("*")
public class CodechellaController {
    @Autowired
    private CodechellaService codechellaService;

    @PostMapping
    public ResponseEntity<Object> cadastrarUsuario (
            @RequestBody @Valid CodechellaDTO codechellaDTO
            ) {
        var codechellaModel = new CodechellaModel();
        BeanUtils.copyProperties(codechellaDTO, codechellaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(codechellaService.getRepository().save(codechellaModel));
    }

}
