package aluno.senai.donatio.service.Pessoa;

import aluno.senai.donatio.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaService {
 private final PessoaRepository repository;
}