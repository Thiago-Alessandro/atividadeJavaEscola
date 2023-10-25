package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Endereco;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public Endereco salvar (Endereco endereco){ return enderecoRepository.save(endereco) ;}

    public Endereco buscarUm(Long id){
        return enderecoRepository.findById(id).get();
    }

    public Collection<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }

    public void deletar(Long id){
        enderecoRepository.deleteById(id);
    }

}
