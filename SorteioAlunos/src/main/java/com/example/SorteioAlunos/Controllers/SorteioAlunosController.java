package com.example.SorteioAlunos.Controllers;

import com.example.SorteioAlunos.Repositories.SorteioAlunosRepository;
import com.example.SorteioAlunos.Services.SorteioAlunosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class SorteioAlunosController {
    private final SorteioAlunosService sorteioAlunosService;

    public SorteioAlunosController(SorteioAlunosService sorteioAlunosService) {
        this.sorteioAlunosService = sorteioAlunosService;
    }

    @GetMapping
    public List<String> getAlunosSorteados() {
        return this.sorteioAlunosService.getAlunosSorteados();
    }
}
