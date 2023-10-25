package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Professor;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private ProfessorService professorService;

    @PostMapping
    public Professor inserir(@RequestBody Professor professor){ return professorService.salvar(professor);}

    @PutMapping
    public Professor atualizar(@RequestBody Professor professor){ return professorService.salvar(professor);}

    @GetMapping
    public Collection<Professor> buscarTodos(){ return professorService.buscarTodos();}

    @GetMapping("/id")
    public Professor buscarUm(@PathVariable Long id){ return professorService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ professorService.deletar(id);}

}
