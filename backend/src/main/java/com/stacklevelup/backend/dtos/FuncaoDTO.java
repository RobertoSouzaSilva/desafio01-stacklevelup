package com.stacklevelup.backend.dtos;

import java.io.Serializable;

import com.stacklevelup.backend.entities.Funcao;

public class FuncaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long codigo;
    private String nome;
    private String descricao;
    private String sigla;

    public FuncaoDTO() {

    }

    public FuncaoDTO(Funcao funcao) {
        this.codigo = funcao.getCodigo();
        this.nome = funcao.getNome();
        this.descricao = funcao.getDescricao();
        this.sigla = funcao.getSigla();
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    
}
