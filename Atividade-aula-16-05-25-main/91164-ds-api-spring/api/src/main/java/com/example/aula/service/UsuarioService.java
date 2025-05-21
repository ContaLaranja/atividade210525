package com.example.aula.service;

import com.example.aula.model.Usuario;
import com.example.aula.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario) {
        // Aqui você pode adicionar validações extras se necessário
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(@Valid Usuario usuario) {
        Usuario usuarioAtualizar = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new IllegalArgumentException("Jogador não encontrado."));

        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setSexo(usuario.getSexo());
        usuarioAtualizar.setIdade(usuario.getIdade());
        usuarioAtualizar.setAltura(usuario.getAltura());
        usuarioAtualizar.setPeso(usuario.getPeso());
        usuarioAtualizar.setPosicao(usuario.getPosicao());
        usuarioAtualizar.setNumeroCamisa(usuario.getNumeroCamisa());

        return usuarioRepository.save(usuarioAtualizar);
    }

    public void excluir(Long id) {
        Usuario usuarioExcluir = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));

        usuarioRepository.deleteById(usuarioExcluir.getId());
    }
}