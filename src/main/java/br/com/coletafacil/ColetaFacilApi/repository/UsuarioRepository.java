package br.com.coletafacil.ColetaFacilApi.repository;

import br.com.coletafacil.ColetaFacilApi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
