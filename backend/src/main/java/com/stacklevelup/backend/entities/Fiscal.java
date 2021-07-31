package com.stacklevelup.backend.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fiscal")
public class Fiscal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Column(name = "tempo_experiencia")
    private String tempoExpericencia;
    @Column(name = "tempo_pretendida")
    private String funcaoPretendida;

    public Fiscal() {
    }

    public Fiscal(Long codigo, String nome, String email, String telefone, String cpf, String tempoExpericencia, String funcaoPretendida) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tempoExpericencia = tempoExpericencia;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fiscal other = (Fiscal) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    

    

}
