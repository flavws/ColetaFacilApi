package br.com.coletafacil.ColetaFacilApi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ecoponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEcoponto;

    @Column(name = "sub_prefeitura")
    private String subPrefeitura;

    @Column(name = "nome_ecoponto")
    private String nomeEcoponto;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cidade;

    private String uf;
}
