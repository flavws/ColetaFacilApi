package br.com.coletafacil.ColetaFacilApi.dto;

import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.model.Produto;
import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import br.com.coletafacil.ColetaFacilApi.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    private Long idProduto;

    private String nomeProduto;

    private Integer valorPontos;

    private Integer qtdeEstoque;

    private Coletor coletor;

    private Usuario usuario;

    public ProdutoDto (Produto produtos){
        this.idProduto = produtos.getIdProduto();
        this.nomeProduto = produtos.getNomeProduto();
        this.qtdeEstoque = produtos.getQtdeEstoque();
        this.valorPontos = produtos.getValorPontos();
        this.coletor = produtos.getColetor();
        this.usuario = produtos.getUsuario();
    }


    public Optional<Produto> atualizar(Long id, ProdutoRepository produtosRepository) {
        Optional<Produto> produtos = produtosRepository.findById(id);

        produtos.get().setIdProduto(this.idProduto);
        produtos.get().setNomeProduto(this.nomeProduto);
        produtos.get().setQtdeEstoque(this.qtdeEstoque);
        produtos.get().setValorPontos(this.valorPontos);
        produtos.get().setColetor(this.coletor);
        produtos.get().setUsuario(this.usuario);

        return produtos;
    }
}
