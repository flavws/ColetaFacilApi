package br.com.coletafacil.ColetaFacilApi.repository;

import br.com.coletafacil.ColetaFacilApi.model.Resgate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResgateRepository extends JpaRepository<Resgate, Long> {
}
