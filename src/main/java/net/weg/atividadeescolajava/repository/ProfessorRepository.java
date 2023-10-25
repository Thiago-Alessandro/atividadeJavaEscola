package net.weg.atividadeescolajava.repository;

import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
