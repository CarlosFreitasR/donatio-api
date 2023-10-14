package aluno.senai.donatio.service.Categoria;

import aluno.senai.donatio.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoriaService {
 private final CategoriaRepository repository;
}