package com.stacklevelup.backend.dtos;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.stacklevelup.backend.entities.Fiscal;

import org.hibernate.validator.constraints.br.CPF;

public class FiscalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String telefone;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    private String tempoExpericencia;

    @NotBlank
    private String funcaoPretendida;

    public FiscalDTO() {
    }
    
    public FiscalDTO(Fiscal fiscal) {
        this.nome = fiscal.getNome();
        this.email = fiscal.getEmail();
        this.telefone = fiscal.getTelefone();
        this.cpf = fiscal.getCpf();
        this.tempoExpericencia = fiscal.getTempoExpericencia();
        this.funcaoPretendida = fiscal.getFuncaoPretendida();
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
