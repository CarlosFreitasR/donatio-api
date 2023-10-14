package aluno.senai.donatio.service.Estado;

import aluno.senai.donatio.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EstadoService {
 private final EstadoRepository repository;
}