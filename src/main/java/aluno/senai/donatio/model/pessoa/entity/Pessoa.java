package aluno.senai.donatio.model.pessoa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_pessoa", schema = "db_donatio")
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkPessoa", nullable = false)
    private Long pkPessoa;

    @Basic
    @Column(name = "nomePessoa", nullable = false)
    private String nomePessoa;

    @Basic
    @Column(name = "cpfPessoa", nullable = false, length = 11)
    private String cpfPessoa;

    @Basic
    @Column(name = "emailPessoa", nullable = false)
    private String emailPessoa;

    @Basic
    @Column(name = "senhaPessoa", nullable = false)
    private String senhaPessoa;

    @Basic
    @Column(name = "telefonePessoa", nullable = false, length = 14)
    private String telefonePessoa;
}
