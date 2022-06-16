package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.model.User;
import br.com.coletafacil.ColetaFacilApi.repository.UserRepository;
import br.com.coletafacil.ColetaFacilApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    UserRepository repository;
    @PostMapping("/register")
    public User createUser(@RequestBody @Valid User user){
        return service.createUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user){
        System.out.println(repository.findAll());
        return service.loginUser(user);
    }
}
