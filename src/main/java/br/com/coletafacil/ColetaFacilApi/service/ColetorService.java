package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.dto.ColetorDto;
import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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

    public ColetorDto updateColetor(Long id, ColetorDto coletorDTO){
        Optional<Coletor> coletor = coletorDTO.atualizar(id, coletorRepository);
        return new ColetorDto(coletor.get());
    }

    public Coletor registerColetor(Coletor coletor) {
        return coletorRepository.save(coletor);
    }

    public String loginColetor(Coletor coletor) {
        List<Coletor> coletores = coletorRepository.findAll();

        for (Coletor c: coletores){
            if (c.getEmailColetor().equals(coletor.getEmailColetor()) && c.getSenhaColetor().equals(coletor.getSenhaColetor())) {
                return coletor.getNome();
            }
        }
        return "FAILURE";
    }
}

