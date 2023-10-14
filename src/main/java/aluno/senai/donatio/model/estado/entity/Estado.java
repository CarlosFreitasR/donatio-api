package aluno.senai.donatio.model.estado.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_estado", schema = "db_donatio")
public class Estado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pkEstado", nullable = false)
    private Long pkEstado;
    
    @Basic
    @Column(name = "nomeEstado", nullable = false)
    private String nomeEstado;
}
