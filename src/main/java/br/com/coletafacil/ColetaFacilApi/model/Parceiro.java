package br.com.coletafacil.ColetaFacilApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Parceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParceiro;

    private String nomeParceiro;

    private String cnpj;

    private String endereco;

    private String contato;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Produto> produtos;
}
