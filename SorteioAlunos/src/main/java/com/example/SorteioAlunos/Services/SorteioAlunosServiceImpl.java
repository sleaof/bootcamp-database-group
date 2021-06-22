package com.example.SorteioAlunos.Services;

import com.example.SorteioAlunos.Models.Aluno;
import com.example.SorteioAlunos.Repositories.SorteioAlunosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SorteioAlunosServiceImpl implements SorteioAlunosService {
    private final SorteioAlunosRepository sorteioAlunosRepository;

    public SorteioAlunosServiceImpl(SorteioAlunosRepository sorteioAlunosRepository) {
        this.sorteioAlunosRepository = sorteioAlunosRepository;
    }

    @Override
    public List<String> getAlunosSorteados() {
        List<Aluno> alunos = sorteioAlunosRepository.findAll();
        List<String> alunosSorteados = new ArrayList<>();

        Collections.shuffle(alunos);

        for (int i = 0; i < 10; i++) {
            alunosSorteados.add(alunos.get(i).getNome());
        }

        return alunosSorteados;
    }
}
