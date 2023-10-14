package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Endereco.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EnderecoController {
 private final EnderecoService service;
 private final String urlSuffix = "/{pkEndereco}";
}