package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Categoria.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/categoria")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoriaController {
 private final CategoriaService service;
 private final String urlSuffix = "/{pkCategoria}";
}