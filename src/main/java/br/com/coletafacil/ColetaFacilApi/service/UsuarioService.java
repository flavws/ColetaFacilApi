package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.dto.UsuarioDto;
import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import br.com.coletafacil.ColetaFacilApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario){
        usuario = usuarioRepository.save(usuario);
        return usuario;
    }

    public List<UsuarioDto> getUsuario(){
        return usuarioRepository.findAll().stream().map(UsuarioDto::new).collect(Collectors.toList());
    }

    public UsuarioDto updateUsuario(Long id, UsuarioDto usuarioDTO){
        Optional<Usuario> usuario = usuarioDTO.atualizar(id, usuarioRepository);
        return new UsuarioDto(usuario.get());
    }

    public ResponseEntity<?> deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
