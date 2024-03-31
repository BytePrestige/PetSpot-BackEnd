package br.com.petspot.repository;

import br.com.petspot.model.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Lincoln
 */
public interface LoginRepository extends JpaRepository<Login, UUID> {
    Login findByEmailAndSenha(String email, String senha);
}
