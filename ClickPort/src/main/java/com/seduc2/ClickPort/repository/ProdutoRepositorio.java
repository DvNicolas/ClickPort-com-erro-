package com.seduc2.ClickPort.repository;

import com.seduc2.ClickPort.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
    // aqui e pra eu encontrar qualquer coisa
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    // busca produtos por categoria
    List<Produto> findByCategoriaIgnoreCase(String categoria);
    // buscar produto salvo pelo o usuario
    List<Produto> findByUsuarioId(Long usuarioId);

}