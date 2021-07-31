package com.stacklevelup.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.stacklevelup.backend.dtos.FiscalDTO;
import com.stacklevelup.backend.dtos.FuncaoDTO;
import com.stacklevelup.backend.entities.Fiscal;
import com.stacklevelup.backend.entities.Funcao;
import com.stacklevelup.backend.repositories.FiscalRepository;
import com.stacklevelup.backend.repositories.FuncaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FiscalService {
    
    @Autowired
    private FiscalRepository fiscalRepository;

    @Transactional(readOnly = true)
    public List<FiscalDTO> findAll() {
        List<Fiscal> fiscais = fiscalRepository.findAll();
        return  fiscais.stream().map(fiscal -> new FiscalDTO(fiscal)).collect(Collectors.toList());
    }

	@Transactional
    public FiscalDTO insert(FiscalDTO fiscalDTO) {
        Fiscal fiscal = new Fiscal();
        fiscal.setCpf(fiscalDTO.getCpf());
        fiscal.setEmail(fiscalDTO.getEmail());
        fiscal.setFuncaoPretendida(fiscalDTO.getFuncaoPretendida());
        fiscal.setNome(fiscalDTO.getNome());    
        fiscal.setTelefone(fiscalDTO.getTelefone());
        fiscal.setTempoExpericencia(fiscalDTO.getTempoExpericencia());
        fiscal = fiscalRepository.save(fiscal);
        return new FiscalDTO(fiscal);
    }

   
    public void delete(Long id) {
        try {
			fiscalRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new RuntimeException("Id não encontrado " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Violação de integridade");
		}
    }
    
}
