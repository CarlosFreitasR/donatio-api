package aluno.senai.donatio.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tbl_inscricao_estadual", schema = "db_donatio")
public class InscricaoEstadual {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkInscricaoEstadual", nullable = false)
    private Long pkInscricaoEstadual;

    @Basic
    @Column(name = "numeroInscricaoEstadual", nullable = false, length = 9)
    private String numeroInscricaoEstadual;

    @ManyToOne
    @JoinColumn(name = "fkJuridica", referencedColumnName = "pkJuridica", nullable = false)
    private PessoaJuridica pessoaJuridica;
}
