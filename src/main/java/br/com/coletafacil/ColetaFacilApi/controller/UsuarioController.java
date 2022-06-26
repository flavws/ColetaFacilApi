package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.dto.UsuarioDto;
import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import br.com.coletafacil.ColetaFacilApi.repository.UsuarioRepository;
import br.com.coletafacil.ColetaFacilApi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/register")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping
    public List<UsuarioDto> getUsuario(){
        return  usuarioService.getUsuario();
    }

    @PutMapping("/update/{id}")
    public UsuarioDto updateUsuario(@PathVariable Long id, @RequestBody UsuarioDto usuarioDTO){
        return usuarioService.updateUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsuario(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
    }

    @PostMapping("/login")
    public Usuario registerUsuario(@RequestBody Usuario usuario){
        return usuarioService.loginUsuario(usuario);
    }

}
