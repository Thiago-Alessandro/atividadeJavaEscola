package net.weg.atividadeescolajava.service;

import lombok.AllArgsConstructor;
import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {

    private AlunoRepository alunoRepository;

    public Aluno salvar (Aluno aluno){ return alunoRepository.save(aluno) ;}

    public Aluno buscarUm(Long id){
        return alunoRepository.findById(id).get();
    }

    public Collection<Aluno> buscarTodos(){
        return alunoRepository.findAll();
    }

    public void deletar(Long id){
        alunoRepository.deleteById(id);
    }


}
