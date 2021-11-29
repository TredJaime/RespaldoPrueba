package com.nttdata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.repositories.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	
	
}
