package net.weg.atividadeescolajava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Diretor extends Usuario {

    @OneToOne(mappedBy = "diretor")
    //pode ser no outro lado tbm
    private Escola escola;

}
