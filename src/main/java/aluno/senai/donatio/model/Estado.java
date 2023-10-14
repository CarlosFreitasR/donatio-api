package aluno.senai.donatio.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

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
