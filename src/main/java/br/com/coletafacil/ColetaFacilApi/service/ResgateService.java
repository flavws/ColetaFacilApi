package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.model.Resgate;
import br.com.coletafacil.ColetaFacilApi.repository.ResgateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ResgateService {
    @Autowired
    private ResgateRepository resgatesRepository;

    public Resgate createResgate(Resgate resgates){
        resgates = resgatesRepository.save(resgates);

        return resgates;
    }

    public List<ResgatesDTO> getResgates(){
        return resgatesRepository.findAll().stream().map(ResgatesDTO::new).collect(Collectors.toList());
    }

    public ResgatesDTO updateResgate(Long id, ResgatesDTO resgatesDTO){
        Optional<Resgates> resgates = resgatesDTO.atualizar(id, resgatesRepository);
        return new ResgatesDTO(resgates.get());
    }

    public ResponseEntity<?> deleteResgate(Long id){
        resgatesRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
