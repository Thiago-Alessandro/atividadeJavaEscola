package net.weg.atividadeescolajava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @OneToOne
    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @OneToMany
    private List<Curso> listaDeCursos;
    @OneToOne
    private Diretor diretor;

}
