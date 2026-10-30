package com.seduc2.ClickPort.Service;

import com.seduc2.ClickPort.Entity.Usuario;
import com.seduc2.ClickPort.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario cadastrar(Usuario usuario) {
        if (usuarioRepositorio.existsByEmail(usuario.getEmail())) {
            throw new IllegalArgumentException("O e-mail informado já está cadastrado.");
        }
        return usuarioRepositorio.save(usuario);
    }
    public boolean autenticar(String email, String senha) {
        Optional<Usuario> usuarioOpt = usuarioRepositorio.findByEmail(email);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            // Comparação direta de senha
            return usuario.getSenha().equals(senha);
        }
        return false;
    }
    public Usuario buscarPorEmail(String email) {
        return usuarioRepositorio.findByEmail(email).orElse(null);
    }
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepositorio.findById(id);
    }
    public List<Usuario> listarTodos() {
        return usuarioRepositorio.findAll();
    }
    public Usuario atualizar(Long id, Usuario dadosAtualizados) {
        return usuarioRepositorio.findById(id).map(usuario -> {
            usuario.setNome(dadosAtualizados.getNome());
            usuario.setTelefone(dadosAtualizados.getTelefone());
            return usuarioRepositorio.save(usuario);
        }).orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));
    }
}