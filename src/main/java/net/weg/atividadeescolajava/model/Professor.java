package net.weg.atividadeescolajava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    //aparentemente onde estiver o mappedBy estara o JsonIgnore(se for necessario)
    private List<Disciplina> listaDeDisciplinas;
}
