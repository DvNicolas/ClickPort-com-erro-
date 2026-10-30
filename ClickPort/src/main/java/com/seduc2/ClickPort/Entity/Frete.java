package com.seduc2.ClickPort.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_fretes")
public class Frete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoEnvio;
    private BigDecimal valorEstimadoBrl;
    private Integer prazoDiasMin;
    private Integer prazoDiasMax;
    private Double pesoMinimoKg;
    private Double pesoMaximoKg;
    private String codigoRastreio;
    private String statusEnvio;

    // Construtor vazio
    public Frete() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public BigDecimal getValorEstimadoBrl() {
        return valorEstimadoBrl;
    }

    public void setValorEstimadoBrl(BigDecimal valorEstimadoBrl) {
        this.valorEstimadoBrl = valorEstimadoBrl;
    }

    public Integer getPrazoDiasMin() {
        return prazoDiasMin;
    }

    public void setPrazoDiasMin(Integer prazoDiasMin) {
        this.prazoDiasMin = prazoDiasMin;
    }

    public Integer getPrazoDiasMax() {
        return prazoDiasMax;
    }

    public void setPrazoDiasMax(Integer prazoDiasMax) {
        this.prazoDiasMax = prazoDiasMax;
    }

    public Double getPesoMinimoKg() {
        return pesoMinimoKg;
    }

    public void setPesoMinimoKg(Double pesoMinimoKg) {
        this.pesoMinimoKg = pesoMinimoKg;
    }

    public Double getPesoMaximoKg() {
        return pesoMaximoKg;
    }

    public void setPesoMaximoKg(Double pesoMaximoKg) {
        this.pesoMaximoKg = pesoMaximoKg;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public String getStatusEnvio() {
        return statusEnvio;
    }

    public void setStatusEnvio(String statusEnvio) {
        this.statusEnvio = statusEnvio;
    }
}