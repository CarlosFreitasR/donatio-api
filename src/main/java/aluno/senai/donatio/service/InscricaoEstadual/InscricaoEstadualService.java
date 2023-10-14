package aluno.senai.donatio.service.InscricaoEstadual;

import aluno.senai.donatio.repository.InscricaoEstadualRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InscricaoEstadualService {
 private final InscricaoEstadualRepository repository;
}