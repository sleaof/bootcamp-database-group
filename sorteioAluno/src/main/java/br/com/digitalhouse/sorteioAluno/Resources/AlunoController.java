package br.com.digitalhouse.sorteioAluno.Resources;

import br.com.digitalhouse.sorteioAluno.Entitys.Aluno;
import br.com.digitalhouse.sorteioAluno.Services.AlunoServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
public class AlunoController {

    private AlunoServices alunoServices;

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno){
        Aluno alunoCreate = alunoServices.saveAll(aluno);
        return new ResponseEntity<>(alunoCreate,HttpStatus.CREATED);
    }
    @GetMapping("/sorteioaluno")
    public ResponseEntity<List<Aluno>> saveAluno(){
        List<Aluno> sorteio = alunoServices.findTeenAluno();
        return new ResponseEntity<>(sorteio,HttpStatus.CREATED);
    }
}
