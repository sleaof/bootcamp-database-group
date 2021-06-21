package br.com.digitalhouse.sorteioAluno.Services;

import br.com.digitalhouse.sorteioAluno.Entitys.Aluno;

import java.util.List;

public interface AlunoServices {
    public Aluno saveAll(Aluno aluno);
    public List<Aluno> findTeenAluno();
}
