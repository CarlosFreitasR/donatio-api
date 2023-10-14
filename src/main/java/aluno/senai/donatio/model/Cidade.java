package aluno.senai.donatio.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tbl_cidade", schema = "db_donatio")
public class Cidade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkCidade", nullable = false)
    private Long pkCidade;
    
    @Basic
    @Column(name = "nomeCidade", nullable = false)
    private String nomeCidade;
    
    @ManyToOne
    @JoinColumn(name = "fkEstado", referencedColumnName = "pkEstado", nullable = false)
    private Estado estado;
}
