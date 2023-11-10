package com.youtube.jovemtranquilao.debug.business;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.youtube.jovemtranquilao.debug.dto.Login;
import com.youtube.jovemtranquilao.debug.entity.LoginEntity;
import com.youtube.jovemtranquilao.debug.repository.LoginRepository;

@Service
public class LoginBusiness {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginBusiness(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Login save(@ModelAttribute Login login) throws NoSuchAlgorithmException {
        LoginEntity loginEntity = new LoginEntity(
                login.name(),
                encryptSHA256(login.password()));

        loginEntity = loginRepository.save(loginEntity);
        return new Login(loginEntity.getName(), loginEntity.getPassword());
    }

    private String encryptSHA256(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }
}