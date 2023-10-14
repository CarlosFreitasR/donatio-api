package aluno.senai.donatio.service.Objeto;

import aluno.senai.donatio.repository.ObjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ObjetoService {
 private final ObjetoRepository repository;
}