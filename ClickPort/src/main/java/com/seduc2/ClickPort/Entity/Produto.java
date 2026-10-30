package com.seduc2.ClickPort.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private String linkOriginal;
    private String urlImagem;
    private BigDecimal precoYuan;
    private BigDecimal precoBrl;
    private Double pesoKg;
    private String categoria;
    private LocalDateTime dataCriacao;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, String linkOriginal, String urlImagem, BigDecimal precoYuan, BigDecimal precoBrl, Double pesoKg, String categoria, LocalDateTime dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.linkOriginal = linkOriginal;
        this.urlImagem = urlImagem;
        this.precoYuan = precoYuan;
        this.precoBrl = precoBrl;
        this.pesoKg = pesoKg;
        this.categoria = categoria;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLinkOriginal() {
        return linkOriginal;
    }

    public void setLinkOriginal(String linkOriginal) {
        this.linkOriginal = linkOriginal;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public BigDecimal getPrecoYuan() {
        return precoYuan;
    }

    public void setPrecoYuan(BigDecimal precoYuan) {
        this.precoYuan = precoYuan;
    }

    public BigDecimal getPrecoBrl() {
        return precoBrl;
    }

    public void setPrecoBrl(BigDecimal precoBrl) {
        this.precoBrl = precoBrl;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}


