package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Diretor;
import net.weg.atividadeescolajava.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DiretorService {

    private DiretorRepository diretorRepository;

    public Diretor salvar (Diretor diretor){ return diretorRepository.save(diretor) ;}

    public Diretor buscarUm(Long id){
        return diretorRepository.findById(id).get();
    }

    public Collection<Diretor> buscarTodos(){
        return diretorRepository.findAll();
    }

    public void deletar(Long id){
        diretorRepository.deleteById(id);
    }

}
