package com.youtube.jovemtranquilao.debug.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jovemtranquilao.debug.business.LoginBusiness;
import com.youtube.jovemtranquilao.debug.dto.Login;

@RestController
public class DebugRestController {
	@Autowired
	private LoginBusiness loginBusiness;

	@PostMapping("/login")
	public Login login(@RequestBody Login login) throws NoSuchAlgorithmException {
		return loginBusiness.save(login);
	}
}
