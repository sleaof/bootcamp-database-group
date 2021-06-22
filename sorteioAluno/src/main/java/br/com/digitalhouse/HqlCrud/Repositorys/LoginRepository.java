package br.com.digitalhouse.HqlCrud.Repositorys;

import br.com.digitalhouse.HqlCrud.Entitys.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface LoginRepository extends JpaRepository<Login, Integer> {

    @Query(value = "select * from Login", nativeQuery = true)
    public List<Login> findAllEmail();

    @Query(value = "select * from Login where Login.id = :userId", nativeQuery = true)
    public Login getEmail(@Param("userId") Long userId);

    @Modifying
    @Transactional
    @Query(value = "insert into Login (nome, password) VALUES (:nome, :password)", nativeQuery = true)
    public void createEmail(@Param("nome") String nome, @Param("password") String password);


    @Transactional
    @Modifying
    @Query(value = "UPDATE Login u SET u.password = :newPassword WHERE u.id = :id", nativeQuery = true)
    public void updateEmail( @Param("id") Long id,@Param("newPassword") String newPassword);

    @Transactional
    @Modifying
    @Query(value = "delete from Login where Login.id = :id", nativeQuery = true)
    public void deleteEmailById(@Param("id") Long id);
}
