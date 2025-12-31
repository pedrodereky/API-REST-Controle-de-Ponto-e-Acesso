
package com.empresa.controleponto.controller;

import com.empresa.controleponto.entity.RegistroPonto;
import com.empresa.controleponto.repository.RegistroPontoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/pontos")
@RequiredArgsConstructor
public class RegistroPontoController {

    private final RegistroPontoRepository repository;

    @PostMapping
    public RegistroPonto registrar(@RequestBody RegistroPonto ponto) {
        ponto.setDataHora(LocalDateTime.now());
        return repository.save(ponto);
    }

    @GetMapping
    public List<RegistroPonto> listar() {
        return repository.findAll();
    }
}
