package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Disciplina;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DisciplinaService {

    private DisciplinaRepository disciplinaRepository;

    public Disciplina salvar (Disciplina disciplina){ return disciplinaRepository.save(disciplina) ;}

    public Disciplina buscarUm(Long id){
        return disciplinaRepository.findById(id).get();
    }

    public Collection<Disciplina> buscarTodos(){
        return disciplinaRepository.findAll();
    }

    public void deletar(Long id){
        disciplinaRepository.deleteById(id);
    }

}
