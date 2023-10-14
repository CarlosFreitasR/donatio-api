package aluno.senai.donatio.model.bairro.entity;

import aluno.senai.donatio.model.cidade.entity.Cidade;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_bairro", schema = "db_donatio")
public class Bairro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkBairro", nullable = false)
    private Long pkBairro;
    
    @Basic
    @Column(name = "nomeBairro", nullable = false)
    private String nomeBairro;
    
    @ManyToOne
    @JoinColumn(name = "fkCidade", referencedColumnName = "pkCidade", nullable = false)
    private Cidade cidade;
}
