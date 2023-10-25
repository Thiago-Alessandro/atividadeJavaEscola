package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Turma;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {

    private TurmaService turmaService;

    @PostMapping
    public Turma inserir(@RequestBody Turma turma){ return turmaService.salvar(turma);}

    @PutMapping
    public Turma atualizar(@RequestBody Turma turma){ return turmaService.salvar(turma);}

    @GetMapping
    public Collection<Turma> buscarTodos(){ return turmaService.buscarTodos();}

    @GetMapping("/id")
    public Turma buscarUm(@PathVariable Long id){ return turmaService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ turmaService.deletar(id);}

}
