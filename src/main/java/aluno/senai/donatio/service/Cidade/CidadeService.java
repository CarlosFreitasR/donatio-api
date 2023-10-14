package aluno.senai.donatio.service.Cidade;

import aluno.senai.donatio.repository.CidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CidadeService {
 private final CidadeRepository repository;
}