package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Turma;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TurmaService {

    private TurmaRepository turmaRepository;

    public Turma salvar (Turma turma){ return turmaRepository.save(turma) ;}

    public Turma buscarUm(Long id){
        return turmaRepository.findById(id).get();
    }

    public Collection<Turma> buscarTodos(){
        return turmaRepository.findAll();
    }

    public void deletar(Long id){
        turmaRepository.deleteById(id);
    }

}
