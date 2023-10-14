package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Objeto.ObjetoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/objeto")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ObjetoController {
 private final ObjetoService service;
 private final String urlSuffix = "/{pkObjeto}";
}