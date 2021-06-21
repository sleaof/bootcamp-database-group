package br.com.digitalhouse.sorteioAluno.Services;

import br.com.digitalhouse.sorteioAluno.Entitys.Aluno;
import br.com.digitalhouse.sorteioAluno.Repositorys.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Service
public class AlunoServicesImpl implements AlunoServices{

    private AlunoRepository alunoRepository;


    @Override
    public Aluno saveAll(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> findTeenAluno() {
        List<Aluno> alunos = alunoRepository.findAll();
        Collections.shuffle(alunos);

        int randomSeriesLength = 10;

        List<Aluno> randomSeries = alunos.subList(0, randomSeriesLength);
        return randomSeries;
    }
}
