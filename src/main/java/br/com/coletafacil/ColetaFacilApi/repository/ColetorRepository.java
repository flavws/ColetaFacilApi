package br.com.coletafacil.ColetaFacilApi.repository;

import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColetorRepository extends JpaRepository<Coletor, Long> {
}
