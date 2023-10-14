package aluno.senai.donatio.service.Endereco;

import aluno.senai.donatio.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EnderecoService {
 private final EnderecoRepository repository;
}