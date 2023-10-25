package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Diretor;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.DiretorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/diretor")
public class DiretorController {

    private DiretorService diretorService;

    @PostMapping
    public Diretor inserir(@RequestBody Diretor diretor){ return diretorService.salvar(diretor);}

    @PutMapping
    public Diretor atualizar(@RequestBody Diretor diretor){ return diretorService.salvar(diretor);}

    @GetMapping
    public Collection<Diretor> buscarTodos(){ return diretorService.buscarTodos();}

    @GetMapping("/id")
    public Diretor buscarUm(@PathVariable Long id){ return diretorService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ diretorService.deletar(id);}

}
