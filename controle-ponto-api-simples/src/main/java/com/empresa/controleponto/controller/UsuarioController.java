
package com.empresa.controleponto.controller;

import com.empresa.controleponto.entity.Usuario;
import com.empresa.controleponto.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioRepository repository;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }
}
