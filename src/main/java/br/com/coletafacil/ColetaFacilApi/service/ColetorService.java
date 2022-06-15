package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColetorService {
    @Autowired
    private ColetorRepository coletorRepository;

    public Coletor createColetor(Coletor coletor){
        coletor = coletorRepository.save(coletor);

        return coletor;
    }

    public List<Coletor> getColetor(){
        return coletorRepository.findAll();
    }

    public ResponseEntity<?> deleteColetor(Long id){
        coletorRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ColetorDTO updateColetor(Long id, ColetorDTO coletorDTO){
        Optional<Coletor> coletor = coletorDTO.atualizar(id, coletorRepository);
        return new ColetorDTO(coletor.get());
    }
}
