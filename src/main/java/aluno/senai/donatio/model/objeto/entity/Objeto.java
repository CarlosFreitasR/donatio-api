package aluno.senai.donatio.model.objeto.entity;

import aluno.senai.donatio.model.categoria.entity.Categoria;
import aluno.senai.donatio.model.pessoa.entity.Pessoa;
import aluno.senai.donatio.model.pessoaJuridica.entity.PessoaJuridica;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_objeto", schema = "db_donatio")
public class Objeto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkObjeto", nullable = false)
    private Long pkObjeto;

    @Basic
    @Column(name = "nomeObjeto", nullable = false)
    private String nomeObjeto;

    @Basic
    @Column(name = "observacaoObjeto", nullable = false, length = -1)
    private String observacaoObjeto;

    @Basic
    @Column(name = "etadoObjeto", nullable = false, length = 50)
    private String etadoObjeto;

    @ManyToOne
    @JoinColumn(name = "fkCategoria", referencedColumnName = "pkCategoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fkPessoa", referencedColumnName = "pkPessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "fkJuridica", referencedColumnName = "pkJuridica")
    private PessoaJuridica pessoaJuridica;
}
