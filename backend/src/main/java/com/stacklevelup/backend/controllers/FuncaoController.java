package com.stacklevelup.backend.controllers;

import java.net.URI;

import com.stacklevelup.backend.dtos.FuncaoDTO;
import com.stacklevelup.backend.services.FuncaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/funcoes")
public class FuncaoController {

    @Autowired
    private FuncaoService funcaoService;

    @PostMapping
    public ResponseEntity<FuncaoDTO> insert(@RequestBody FuncaoDTO funcaoDTO){
        funcaoDTO = funcaoService.insert(funcaoDTO);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(funcaoDTO.getCodigo())
                .toUri();
        return ResponseEntity.created(uri).body(funcaoDTO);
    }

    
}
