package com.seduc2.ClickPort.repository;

import com.seduc2.ClickPort.Entity.Frete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FreteRepositorio extends JpaRepository<Frete, Long> {

    static Optional<Frete> findByCodigoRastreio(String codigoRastreio) {
        return null;
    }

    List<Frete> findByTipoEnvio(String tipoEnvio);
    List<Frete> findByStatusEnvio(String statusEnvio);
}