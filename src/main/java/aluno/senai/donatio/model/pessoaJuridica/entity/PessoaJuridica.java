package aluno.senai.donatio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_pessoa_juridica", schema = "db_donatio")
public class PessoaJuridica {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkJuridica", nullable = false)
    private Long pkJuridica;

    @Basic
    @Column(name = "nomeFantasia", nullable = false)
    private String nomeFantasia;

    @Basic
    @Column(name = "razaoSocial", nullable = false)
    private String razaoSocial;

    @Basic
    @Column(name = "cnpjJuridica", nullable = false, length = 14)
    private String cnpjJuridica;

    @Basic
    @Column(name = "emailJuridico", nullable = false)
    private String emailJuridico;

    @Basic
    @Column(name = "senhaJuridico", nullable = false)
    private String senhaJuridico;
    @Basic
    @Column(name = "telefoneJuridico", nullable = false, length = 14)
    private String telefoneJuridico;

    @Basic
    @Column(name = "entregador", nullable = false)
    private Byte entregador;

    @Basic
    @Column(name = "nomeResponsavel", nullable = false)
    private String nomeResponsavel;

    @Basic
    @Column(name = "perfil", nullable = false)
    private Object perfil;
}
