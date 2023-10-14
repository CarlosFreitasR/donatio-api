package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.InscricaoEstadual.InscricaoEstadualService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/inscricaoestadual")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InscricaoEstadualController {
 private final InscricaoEstadualService service;
 private final String urlSuffix = "/{pkInscricaoEstadual}";
}