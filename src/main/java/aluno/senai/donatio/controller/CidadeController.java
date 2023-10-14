package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Cidade.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cidade")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CidadeController {
 private final CidadeService service;
 private final String urlSuffix = "/{pkCidade}";
}