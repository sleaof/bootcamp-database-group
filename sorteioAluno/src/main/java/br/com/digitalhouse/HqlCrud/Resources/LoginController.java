package br.com.digitalhouse.HqlCrud.Resources;

import br.com.digitalhouse.HqlCrud.Entitys.Login;
import br.com.digitalhouse.HqlCrud.Services.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/email")
public class LoginController {

    private LoginService loginService;

    @GetMapping
    public ResponseEntity<List<Login>> findAllEmails(){
        return new ResponseEntity<>(loginService.findAllEmails(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Login> getEmails(@PathVariable Long userId) {
        return new ResponseEntity<>(loginService.getEmails(userId),HttpStatus.ACCEPTED);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmail(@RequestBody Login login){
         loginService.createEmail(login.getNome(), login.getPassword());
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody String newPassword){
         loginService.updateEmail(id,newPassword);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
         loginService.deleteEmailById(id);
    }
}
