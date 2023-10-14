package aluno.senai.donatio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

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
    
    @OneToMany(mappedBy = "bairro")
    private Collection<Endereco> enderecos;
}
