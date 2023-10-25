package net.weg.atividadeescolajava.repository;

import net.weg.atividadeescolajava.model.Aluno;
import net.weg.atividadeescolajava.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
