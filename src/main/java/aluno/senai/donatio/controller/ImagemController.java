package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Imagem.ImagemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/imagem")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImagemController {
 private final ImagemService service;
 private final String urlSuffix = "/{pkImagem}";
}