package aluno.senai.donatio.repository;

import aluno.senai.donatio.model.interesse.entity.Interesse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteresseRepository extends JpaRepository<Interesse, Long> {
}