package net.weg.atividadeescolajava.repository;

import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
