package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Pessoa.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {
 private final PessoaService service;
 private final String urlSuffix = "/{pkPessoa}";
}