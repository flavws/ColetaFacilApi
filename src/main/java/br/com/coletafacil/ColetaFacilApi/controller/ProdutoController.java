package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.dto.ProdutoDto;
import br.com.coletafacil.ColetaFacilApi.model.Produto;
import br.com.coletafacil.ColetaFacilApi.repository.ProdutoRepository;
import br.com.coletafacil.ColetaFacilApi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public Produto createProduto(@RequestBody Produto produtos){
        return produtoService.createProduto(produtos);
    }

    @GetMapping
    public List<ProdutoDto> getProdutos(){
        return produtoService.getProduto();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDto> updateProduto(@PathVariable Long id, @RequestBody ProdutoDto produtosDTO){
        return ResponseEntity.ok(produtoService.updateProduto(id, produtosDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduto (@PathVariable Long id){
        return ResponseEntity.ok(produtoService.deleteProduto(id));
    }

}
