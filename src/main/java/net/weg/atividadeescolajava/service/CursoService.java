package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Curso;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import net.weg.atividadeescolajava.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CursoService {

    private CursoRepository cursoRepository;

    public Curso salvar (Curso curso){ return cursoRepository.save(curso) ;}

    public Curso buscarUm(Long id){
        return cursoRepository.findById(id).get();
    }

    public Collection<Curso> buscarTodos(){
        return cursoRepository.findAll();
    }

    public void deletar(Long id){
        cursoRepository.deleteById(id);
    }

}
