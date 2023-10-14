package aluno.senai.donatio.service.Imagem;

import aluno.senai.donatio.repository.ImagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImagemService {
 private final ImagemRepository repository;
}