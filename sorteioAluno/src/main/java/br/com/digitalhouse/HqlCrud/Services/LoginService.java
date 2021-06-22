package br.com.digitalhouse.HqlCrud.Services;

import br.com.digitalhouse.HqlCrud.Entitys.Login;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface LoginService {

    List<Login> findAllEmails();

    Login getEmails(Long userId);

    void createEmail(String username, String password);

    void updateEmail(Long id, String newPassword);

    void deleteEmailById(Long id);

}
