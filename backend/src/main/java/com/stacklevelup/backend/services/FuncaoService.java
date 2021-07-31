package com.stacklevelup.backend.services;

import com.stacklevelup.backend.dtos.FuncaoDTO;
import com.stacklevelup.backend.entities.Funcao;
import com.stacklevelup.backend.repositories.FuncaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncaoService {

    @Autowired
    private FuncaoRepository funcaoRepository;

    public FuncaoDTO insert(FuncaoDTO funcaoDTO) {
        Funcao funcao = new Funcao();
        funcao.setDescricao(funcaoDTO.getDescricao());
        funcao.setNome(funcaoDTO.getNome());
        funcao.setSigla(funcaoDTO.getSigla());
        funcao = funcaoRepository.save(funcao);
        return new FuncaoDTO(funcao);
    }
    
}
