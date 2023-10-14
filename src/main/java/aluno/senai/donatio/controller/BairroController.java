package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Bairro.BairroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/bairro")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BairroController {
 private final BairroService service;
 private final String urlSuffix = "/{pkBairro}";
}