package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Escola;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EscolaService {

    private EscolaRepository escolaRepository;

    public Escola salvar (Escola escola){ return escolaRepository.save(escola) ;}

    public Escola buscarUm(Long id){
        return escolaRepository.findById(id).get();
    }

    public Collection<Escola> buscarTodos(){
        return escolaRepository.findAll();
    }

    public void deletar(Long id){
        escolaRepository.deleteById(id);
    }

}
