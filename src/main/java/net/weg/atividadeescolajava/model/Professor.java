package net.weg.atividadeescolajava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professor extends Usuario{

    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "listaDeProfessores")
    //Poderia ser do outro lado da relação, só iria mudar o nome da tabela-relacionamento no BD
    private List<Disciplina> listaDeDisciplinas;
}
