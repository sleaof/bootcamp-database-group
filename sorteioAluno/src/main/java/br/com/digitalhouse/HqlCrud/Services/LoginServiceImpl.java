package br.com.digitalhouse.HqlCrud.Services;

import br.com.digitalhouse.HqlCrud.Entitys.Login;
import br.com.digitalhouse.HqlCrud.Repositorys.LoginRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

    private LoginRepository loginRepository;


    @Override
    public List<Login> findAllEmails() {
        return loginRepository.findAllEmail();
    }

    @Override
    public Login getEmails(Long userId) {
        return loginRepository.getEmail(userId);
    }

    @Override
    public void createEmail(String nome,String password) {
         loginRepository.createEmail(nome,password);
    }

    @Override
    public void updateEmail(Long id,String newPassword) {
         loginRepository.updateEmail(id,newPassword);
    }

    @Override
    public void deleteEmailById(Long id) {
         loginRepository.deleteEmailById(id);
    }
}
