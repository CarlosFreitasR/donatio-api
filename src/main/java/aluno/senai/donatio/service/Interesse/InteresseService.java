package aluno.senai.donatio.service.Interesse;

import aluno.senai.donatio.repository.InteresseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InteresseService {
 private final InteresseRepository repository;
}