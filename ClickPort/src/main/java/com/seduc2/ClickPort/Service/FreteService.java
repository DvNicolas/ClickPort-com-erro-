package com.seduc2.ClickPort.Service;

import com.seduc2.ClickPort.Entity.Frete;
import com.seduc2.ClickPort.repository.FreteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FreteService {

    @Autowired
    private FreteRepositorio freteRepositorio;

    public static Frete buscarPorCodigoRastreio(Integer codigoRastreio) {
        return null;
    }


    public static List<Frete> calcularOpcoesFrete(Double pesoKg) {
        List<Frete> opcoes = new ArrayList<>();

        if (pesoKg == null || pesoKg <= 0) {
            return opcoes;
        }


        Frete aereo = new Frete();
        aereo.setTipoEnvio("Aereo");
        aereo.setPrazoDiasMin(7);
        aereo.setPrazoDiasMax(15);

        BigDecimal valorBaseAereo = new BigDecimal("80.00"); // Valor fixo por kg
        BigDecimal valorTotalAereo = valorBaseAereo.multiply(BigDecimal.valueOf(pesoKg));
        aereo.setValorEstimadoBrl(valorTotalAereo);
        opcoes.add(aereo);


        Frete maritimo = new Frete();
        maritimo.setTipoEnvio("Navio Cargueiro");
        maritimo.setPrazoDiasMin(30);
        maritimo.setPrazoDiasMax(50);

        BigDecimal valorBaseMaritimo = new BigDecimal("50.00"); // Valor fixo por kg
        BigDecimal valorTotalMaritimo = valorBaseMaritimo.multiply(BigDecimal.valueOf(pesoKg));
        maritimo.setValorEstimadoBrl(valorTotalMaritimo);
        opcoes.add(maritimo);

        return opcoes;
    }
    public static Frete buscarPorCodigoRastreio(String codigoRastreio) {
        return  FreteRepositorio.findByCodigoRastreio(codigoRastreio).orElse(null);
    }
    public Frete salvar(Frete frete) {
        return freteRepositorio.save(frete);
    }
}