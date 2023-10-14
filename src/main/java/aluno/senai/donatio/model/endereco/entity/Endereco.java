package aluno.senai.donatio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "tbl_endereco", schema = "db_donatio")
public class Endereco {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkEndereco", nullable = false)
    private Long pkEndereco;

    @Basic
    @Column(name = "ruaEndereco", nullable = false)
    private String ruaEndereco;

    @Basic
    @Column(name = "numeroEndereco", nullable = false)
    private Integer numeroEndereco;

    @Basic
    @Column(name = "cepEndereco", nullable = false, length = 8)
    private String cepEndereco;

    @ManyToOne
    @JoinColumn(name = "fkBairro", referencedColumnName = "pkBairro", nullable = false)
    private Bairro bairro;

    @ManyToMany
    @JoinTable(name = "tbl_endereco_pessoa", schema = "db_donatio",
            joinColumns = @JoinColumn(name = "fkEndereco", referencedColumnName = "pkEndereco", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "fkPessoa", referencedColumnName = "pkPessoa"))
    private Collection<Pessoa> pessoas;

    @ManyToMany
    @JoinTable(name = "tbl_endereco_pessoa_juridica", schema = "db_donatio",
            joinColumns = @JoinColumn(name = "fkEndereco", referencedColumnName = "pkEndereco", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "fkPessoa", referencedColumnName = "pkJuridica"))
    private Collection<PessoaJuridica> pessoaJuridicas;
}
