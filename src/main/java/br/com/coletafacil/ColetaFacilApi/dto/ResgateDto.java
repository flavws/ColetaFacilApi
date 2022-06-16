package br.com.coletafacil.ColetaFacilApi.dto;

import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.model.Produto;
import br.com.coletafacil.ColetaFacilApi.model.Resgate;
import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import br.com.coletafacil.ColetaFacilApi.repository.ResgateRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResgateDto {
    private Long idResgate;

    private LocalDate dataResgate;

    private Usuario usuario;

    private List<Produto> produtos;

    private Coletor coletor;

    public ResgateDto (Resgate resgates){
        this.idResgate = resgates.getIdResgate();
        this.dataResgate = resgates.getDataResgate();
        this.usuario = resgates.getUsuario();
        this.produtos = resgates.getProdutos();
        this.coletor = resgates.getColetor();
    }


    public Optional<Resgate> atualizar(Long id, ResgateRepository resgatesRepository) {

        Optional<Resgate> resgates = resgatesRepository.findById(id);

        resgates.get().setIdResgate(this.idResgate);
        resgates.get().setDataResgate(this.dataResgate);
        resgates.get().setColetor(this.coletor);
        resgates.get().setProdutos(this.produtos);
        resgates.get().setUsuario(this.usuario);

        return resgates;
    }
}
