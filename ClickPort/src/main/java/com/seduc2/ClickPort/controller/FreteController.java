package com.seduc2.ClickPort.controller;

import com.seduc2.ClickPort.Entity.Frete;
import com.seduc2.ClickPort.Service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/frete")
@CrossOrigin(origins = "*")
public class FreteController {

    @Autowired
    private FreteService service; // Nome da variável injetada

    @GetMapping("/calcular")
    public ResponseEntity<List<Frete>> calcularFrete(@RequestParam("pesoKg") Double pesoKg) {
        // Usa 'service' (em minúsculo) e ajusta para List<Frete>
        List<Frete> opcoesFrete = service.calcularOpcoesFrete(pesoKg);
        return ResponseEntity.ok(opcoesFrete);
    }

    @GetMapping("/rastrear/{codigoRastreio}")
    public ResponseEntity<Frete> rastrear(@PathVariable("codigoRastreio") String codigoRastreio) {
        // Usa 'service' em vez do nome da classe
        Frete frete = service.buscarPorCodigoRastreio(codigoRastreio);
        if (frete == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(frete);
    }
}