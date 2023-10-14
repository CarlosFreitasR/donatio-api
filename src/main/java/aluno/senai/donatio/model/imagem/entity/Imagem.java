package aluno.senai.donatio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "tbl_imagem", schema = "db_donatio")
public class Imagem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkImagem", nullable = false)
    private Long pkImagem;

    @Basic
    @Column(name = "nomeImagem", nullable = false)
    private String nomeImagem;

    @Basic
    @Column(name = "imagem", nullable = false)
    private byte[] imagem;

    @ManyToOne
    @JoinColumn(name = "fkObjeto", referencedColumnName = "pkObjeto", nullable = false)
    private Objeto objeto;
}
