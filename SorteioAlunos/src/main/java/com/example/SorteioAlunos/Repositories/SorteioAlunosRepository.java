package com.example.SorteioAlunos.Repositories;

import com.example.SorteioAlunos.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SorteioAlunosRepository extends JpaRepository<Aluno, Long> {
}
