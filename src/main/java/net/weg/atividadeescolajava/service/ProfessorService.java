package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Professor;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public Professor salvar (Professor professor){ return professorRepository.save(professor) ;}

    public Professor buscarUm(Long id){
        return professorRepository.findById(id).get();
    }

    public Collection<Professor> buscarTodos(){
        return professorRepository.findAll();
    }

    public void deletar(Long id){
        professorRepository.deleteById(id);
    }

}
