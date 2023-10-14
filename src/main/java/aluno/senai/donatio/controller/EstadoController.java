package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Estado.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/estado")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EstadoController {
 private final EstadoService service;
 private final String urlSuffix = "/{pkEstado}";
}