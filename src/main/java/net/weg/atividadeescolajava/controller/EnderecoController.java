package net.weg.atividadeescolajava.controller;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Endereco;
import net.weg.atividadeescolajava.service.AlunoService;
import net.weg.atividadeescolajava.service.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

    @PostMapping
    public Endereco inserir(@RequestBody Endereco endereco){ return enderecoService.salvar(endereco);}

    @PutMapping
    public Endereco atualizar(@RequestBody Endereco endereco){ return enderecoService.salvar(endereco);}

    @GetMapping
    public Collection<Endereco> buscarTodos(){ return enderecoService.buscarTodos();}

    @GetMapping("/id")
    public Endereco buscarUm(@PathVariable Long id){ return enderecoService.buscarUm(id);}

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){ enderecoService.deletar(id);}

}
