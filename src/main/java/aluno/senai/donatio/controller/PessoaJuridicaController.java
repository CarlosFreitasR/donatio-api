package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.PessoaJuridica.PessoaJuridicaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pessoajuridica")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaJuridicaController {
 private final PessoaJuridicaService service;
 private final String urlSuffix = "/{pkPessoaJuridica}";
}