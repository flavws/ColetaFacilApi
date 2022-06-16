package br.com.coletafacil.ColetaFacilApi.dto;

import br.com.coletafacil.ColetaFacilApi.model.Parceiro;
import br.com.coletafacil.ColetaFacilApi.model.Produto;
import br.com.coletafacil.ColetaFacilApi.repository.ParceiroRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParceiroDto {

    private Long idParceiro;

    private String nomeParceiro;

    private String cnpj;

    private String endereco;

    private String contato;

    private List<Produto> produtos;

    public ParceiroDto(Parceiro parceiro){
        this.idParceiro = parceiro.getIdParceiro();
        this.cnpj = parceiro.getCnpj();
        this.nomeParceiro = parceiro.getNomeParceiro();
        this.contato = parceiro.getContato();
        this.endereco = parceiro.getEndereco();
        this.produtos = parceiro.getProdutos();
    }


    public Optional<Parceiro> atualizar(Long id, ParceiroRepository parceirosRepository) {

        Optional<Parceiro> parceiros = parceirosRepository.findById(id);

        parceiros.get().setIdParceiro(this.idParceiro);
        parceiros.get().setNomeParceiro(this.nomeParceiro);
        parceiros.get().setCnpj(this.cnpj);
        parceiros.get().setContato(this.contato);
        parceiros.get().setEndereco(this.endereco);
        parceiros.get().setProdutos(this.produtos);

        return parceiros;
    }
}
