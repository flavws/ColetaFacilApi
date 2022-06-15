package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.model.Parceiro;
import br.com.coletafacil.ColetaFacilApi.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ParceiroService {
    @Autowired
    ParceiroRepository parceirosRepository;

    public Parceiro createParceiro(Parceiro parceiros){
        parceiros = parceirosRepository.save(parceiros);
        return parceiros;
    }

    public List<ParceirosDTO> getParceiro(){
        return parceirosRepository.findAll().stream().map(ParceirosDTO::new).collect(Collectors.toList());
    }

    public ParceirosDTO updateParceiro(Long id, ParceirosDTO parceirosDTO){
        Optional<Parceiros> parceiros = parceirosDTO.atualizar(id, parceirosRepository);
        return new ParceirosDTO(parceiros.get());
    }
    public ResponseEntity<?> deleteParceiro(Long id){
        parceirosRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
