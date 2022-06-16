package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.dto.ParceiroDto;
import br.com.coletafacil.ColetaFacilApi.dto.ProdutoDto;
import br.com.coletafacil.ColetaFacilApi.model.Parceiro;
import br.com.coletafacil.ColetaFacilApi.model.Produto;
import br.com.coletafacil.ColetaFacilApi.repository.ParceiroRepository;
import br.com.coletafacil.ColetaFacilApi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtosRepository;

    public Produto createProduto(Produto produtos){
        produtos = produtosRepository.save(produtos);

        return produtos;
    }

    public List<ProdutoDto> getProduto(){
        return produtosRepository.findAll().stream().map(ProdutoDto::new).collect(Collectors.toList());
    }

    public ProdutoDto updateProduto(Long id, ProdutoDto produtosDTO){
        Optional<Produto> produtos = produtosDTO.atualizar(id, produtosRepository);
        return new ProdutoDto(produtos.get());
    }

    public ResponseEntity<?> deleteProduto(Long id){
        produtosRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
