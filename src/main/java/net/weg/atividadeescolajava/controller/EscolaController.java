package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Escola;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService escolaService;

    @PostMapping
    public Escola inserir(@RequestBody Escola escola){ return escolaService.salvar(escola);}

    @PutMapping
    public Escola atualizar(@RequestBody Escola escola){ return escolaService.salvar(escola);}

    @GetMapping
    public Collection<Escola> buscarTodos(){ return escolaService.buscarTodos();}

    @GetMapping("/id")
    public Escola buscarUm(@PathVariable Long id){ return escolaService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ escolaService.deletar(id);}

}
