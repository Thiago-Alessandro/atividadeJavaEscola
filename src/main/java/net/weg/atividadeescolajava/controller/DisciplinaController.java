package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Disciplina;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @PostMapping
    public Disciplina inserir(@RequestBody Disciplina disciplina){ return disciplinaService.salvar(disciplina);}

    @PutMapping
    public Disciplina atualizar(@RequestBody Disciplina disciplina){ return disciplinaService.salvar(disciplina);}

    @GetMapping
    public Collection<Disciplina> buscarTodos(){ return disciplinaService.buscarTodos();}

    @GetMapping("/id")
    public Disciplina buscarUm(@PathVariable Long id){ return disciplinaService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ disciplinaService.deletar(id);}

}
