package br.com.coletafacil.ColetaFacilApi.dto;

import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import br.com.coletafacil.ColetaFacilApi.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

    private Long idUsuario;

    private String cpf;

    private String nomeUsuario;

    private Integer ptsAcumulados;

    private String endereco;

    private String bairro;

    private String contato;

    private Integer nivel;

    public UsuarioDto(Usuario usuario){
        this.idUsuario = usuario.getIdUsuario();
        this.cpf = usuario.getCpf();
        this.nomeUsuario = usuario.getNomeUsuario();
        this.ptsAcumulados = usuario.getPtsAcumulados();
        this.endereco = usuario.getEndereco();
        this.bairro = usuario.getBairro();
        this.contato = usuario.getContato();
        this.nivel = usuario.getNivel();
    }

    public Optional<Usuario> atualizar(Long id, UsuarioRepository usuarioRepository) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        usuario.get().setIdUsuario(this.idUsuario);
        usuario.get().setCpf(this.cpf);
        usuario.get().setNomeUsuario(this.nomeUsuario);
        usuario.get().setBairro(this.bairro);
        usuario.get().setContato(this.contato);
        usuario.get().setEndereco(this.endereco);
        usuario.get().setPtsAcumulados(this.ptsAcumulados);
        usuario.get().setNivel(this.nivel);

        return usuario;
    }
}
