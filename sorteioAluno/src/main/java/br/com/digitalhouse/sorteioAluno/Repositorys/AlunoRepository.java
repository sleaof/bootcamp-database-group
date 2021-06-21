package br.com.digitalhouse.sorteioAluno.Repositorys;

import br.com.digitalhouse.sorteioAluno.Entitys.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
