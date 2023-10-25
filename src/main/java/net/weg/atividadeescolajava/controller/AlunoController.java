package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.service.AlunoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoService alunoService;

    @PostMapping
    public Aluno inserir(@RequestBody Aluno aluno){ return alunoService.salvar(aluno);}

    @PutMapping
    public Aluno atualizar(@RequestBody Aluno aluno){ return alunoService.salvar(aluno);}

    @GetMapping
    public Collection<Aluno> buscarTodos(){ return alunoService.buscarTodos();}

    @GetMapping("/id")
    public Aluno buscarUm(@PathVariable Long id){ return alunoService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ alunoService.deletar(id);}

}
