package com.seduc2.ClickPort.Service;

import com.seduc2.ClickPort.Entity.Produto;
import com.seduc2.ClickPort.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;


    private static final BigDecimal TAXA_CAMBIO_YUAN_PARA_BRL = new BigDecimal("0.75");

    // faz a busca
    public List<Produto> buscarProdutos(String query) {
        if (query == null || query.trim().isEmpty()) {
            return produtoRepositorio.findAll();
        }
        return produtoRepositorio.findByNomeContainingIgnoreCase(query);
    }

    // Converte o preço
    public BigDecimal converterYuanParaBrl(BigDecimal precoYuan) {
        if (precoYuan == null) {
            return BigDecimal.ZERO;
        }
        return precoYuan.multiply(TAXA_CAMBIO_YUAN_PARA_BRL).setScale(2, RoundingMode.HALF_UP);
    }

    // salvar e atualizar
    public Produto salvar(Produto produto) {
        if (produto.getPrecoYuan() != null && produto.getPrecoBrl() == null) {
            produto.setPrecoBrl(converterYuanParaBrl(produto.getPrecoYuan()));
        }
        return produtoRepositorio.save(produto);
    }
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepositorio.findById(id);
    }
    public List<Produto> listarTodos() {
        return produtoRepositorio.findAll();
    }
    public void deletar(Long id) {
        produtoRepositorio.deleteById(id);
    }
}