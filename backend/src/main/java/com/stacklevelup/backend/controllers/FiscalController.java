package com.stacklevelup.backend.controllers;

import java.net.URI;
import java.util.List;

import com.stacklevelup.backend.dtos.FiscalDTO;
import com.stacklevelup.backend.services.FiscalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/fiscais")
public class FiscalController {

    @Autowired
    private FiscalService fiscalService;

    @GetMapping
	public ResponseEntity<List<FiscalDTO>> findAll(){
		List<FiscalDTO> list = fiscalService.findAll();
		return ResponseEntity.ok().body(list);
	}

    @PostMapping
    public ResponseEntity<FiscalDTO> insert(@RequestBody FiscalDTO fiscalDTO){
        fiscalDTO = fiscalService.insert(fiscalDTO);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(fiscalDTO.getCodigo())
                .toUri();
        return ResponseEntity.created(uri).body(fiscalDTO);
    }



    @DeleteMapping(value = "/{id}")
    public ResponseEntity<FiscalDTO> delete(@PathVariable Long id){
        fiscalService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
