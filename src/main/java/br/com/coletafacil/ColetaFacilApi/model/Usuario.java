package br.com.coletafacil.ColetaFacilApi.model;

import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String cpf;
    // TODO: 06/06/2022 colocar campos obrigatórios
    private String nomeUsuario;

    private String email;

    private String senha;

    private Integer ptsAcumulados;

    private String endereco;

    private String bairro;

    private String contato;

    private Integer nivel;

}
