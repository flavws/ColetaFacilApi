package br.com.coletafacil.ColetaFacilApi.repository;

import br.com.coletafacil.ColetaFacilApi.model.Ecoponto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcopontoRepository extends JpaRepository<Ecoponto, Long> {
}

