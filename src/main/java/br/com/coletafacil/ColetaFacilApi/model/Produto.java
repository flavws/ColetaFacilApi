package br.com.coletafacil.ColetaFacilApi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String nomeProduto;

    private Integer valorPontos;

    private Integer qtdeEstoque;

    @ManyToOne
    private Coletor coletor;

    @ManyToOne
    private Usuario usuario;
}
