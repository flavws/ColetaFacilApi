package br.com.coletafacil.ColetaFacilApi.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class Resgate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResgate;

    private LocalDate dataResgate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Produto> produtos;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Coletor coletor;
}
