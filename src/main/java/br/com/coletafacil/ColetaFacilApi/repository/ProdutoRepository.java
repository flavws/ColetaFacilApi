package br.com.coletafacil.ColetaFacilApi.repository;

import br.com.coletafacil.ColetaFacilApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
