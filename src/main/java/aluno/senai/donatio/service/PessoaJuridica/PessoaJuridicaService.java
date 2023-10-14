package aluno.senai.donatio.service.PessoaJuridica;

import aluno.senai.donatio.repository.PessoaJuridicaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaJuridicaService {
 private final PessoaJuridicaRepository repository;
}