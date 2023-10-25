package net.weg.atividadeescolajava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(UsuarioId.class)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Id
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne
    private Endereco endereco;

}
