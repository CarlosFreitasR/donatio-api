package aluno.senai.donatio.repository;

import aluno.senai.donatio.model.InscricaoEstadual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoEstadualRepository extends JpaRepository<InscricaoEstadual, Long> {
}