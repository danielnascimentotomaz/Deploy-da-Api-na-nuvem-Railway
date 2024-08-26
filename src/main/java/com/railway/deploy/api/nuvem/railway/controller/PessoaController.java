package com.railway.deploy.api.nuvem.railway.controller;

import com.railway.deploy.api.nuvem.railway.dto.Pessoa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping("/dados")
    public ResponseEntity<Pessoa> dadosPessoa(){

        Pessoa dados = new Pessoa("Daniel",28,"Masculino");

        return ResponseEntity.ok(dados);


    }



}
