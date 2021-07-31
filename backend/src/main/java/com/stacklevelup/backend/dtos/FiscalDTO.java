package com.stacklevelup.backend.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.stacklevelup.backend.entities.Fiscal;
import com.stacklevelup.backend.entities.Funcao;

public class FiscalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long codigo;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String telefone;

    @NotBlank
    private String cpf;

    @NotBlank
    private String tempoExpericencia;

    private String funcaoPretendida;

    public FiscalDTO() {
    }
    
    public FiscalDTO(Fiscal fiscal) {
        this.codigo = fiscal.getCodigo();
        this.nome = fiscal.getNome();
        this.email = fiscal.getEmail();
        this.telefone = fiscal.getTelefone();
        this.cpf = fiscal.getCpf();
        this.tempoExpericencia = fiscal.getTempoExpericencia();
        this.funcaoPretendida = fiscal.getFuncaoPretendida();
    }    

    // public FiscalDTO(Fiscal fiscal, List<Funcao> funcoes) {
	// 	this(fiscal);
	// 	funcoes.forEach(funcao -> this.funcoes.add(new FuncaoDTO(funcao)));
	// }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTempoExpericencia() {
        return tempoExpericencia;
    }

    public void setTempoExpericencia(String tempoExpericencia) {
        this.tempoExpericencia = tempoExpericencia;
    }

    public String getFuncaoPretendida() {
        return funcaoPretendida;
    }

    public void setFuncaoPretendida(String funcaoPretendida) {
        this.funcaoPretendida = funcaoPretendida;
    }

}
