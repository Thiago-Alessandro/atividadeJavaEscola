package net.weg.atividadeescolajava.controller;


import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Curso;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;

    @PostMapping
    public Curso inserir(@RequestBody Curso curso){ return cursoService.salvar(curso);}

    @PutMapping
    public Curso atualizar(@RequestBody Curso curso){ return cursoService.salvar(curso);}

    @GetMapping
    public Collection<Curso> buscarTodos(){ return cursoService.buscarTodos();}

    @GetMapping("/id")
    public Curso buscarUm(@PathVariable Long id){ return cursoService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ cursoService.deletar(id);}

}
