package aluno.senai.donatio.service.Bairro;

import aluno.senai.donatio.repository.BairroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BairroService {
 private final BairroRepository repository;
}