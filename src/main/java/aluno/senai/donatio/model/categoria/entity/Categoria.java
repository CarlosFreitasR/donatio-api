package aluno.senai.donatio.model.categoria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_categoria", schema = "db_donatio")
public class Categoria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkCategoria", nullable = false)
    private Long pkCategoria;

    @Basic
    @Column(name = "nomeCategoria", nullable = false)
    private String nomeCategoria;
}
