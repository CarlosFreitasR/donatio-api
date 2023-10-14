package aluno.senai.donatio.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tbl_interesse", schema = "db_donatio")
public class Interesse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkInteresse", nullable = false)
    private Long pkInteresse;

    @Basic
    @Column(name = "entregue", nullable = false)
    private boolean entregue;

    @ManyToOne
    @JoinColumn(name = "fkObjeto", referencedColumnName = "pkObjeto", nullable = false)
    private Objeto objeto;

    @ManyToOne
    @JoinColumn(name = "fkPessoa", referencedColumnName = "pkPessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "fkJuridica", referencedColumnName = "pkJuridica")
    private PessoaJuridica pessoaJuridica;
}
