package aluno.senai.donatio.controller;

import aluno.senai.donatio.service.Interesse.InteresseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/interesse")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InteresseController {
 private final InteresseService service;
 private final String urlSuffix = "/{pkInteresse}";
}