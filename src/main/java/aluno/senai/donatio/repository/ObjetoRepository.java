package aluno.senai.donatio.repository;

import aluno.senai.donatio.model.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Long> {
}