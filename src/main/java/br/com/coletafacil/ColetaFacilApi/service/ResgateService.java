package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.dto.ResgateDto;
import br.com.coletafacil.ColetaFacilApi.model.Resgate;
import br.com.coletafacil.ColetaFacilApi.repository.ResgateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResgateService {
    @Autowired
    private ResgateRepository resgatesRepository;

    public Resgate createResgate(Resgate resgates){
        resgates = resgatesRepository.save(resgates);

        return resgates;
    }

    public List<ResgateDto> getResgates(){
        return resgatesRepository.findAll().stream().map(ResgateDto::new).collect(Collectors.toList());
    }

    public ResgateDto updateResgate(Long id, ResgateDto resgatesDTO){
        Optional<Resgate> resgates = resgatesDTO.atualizar(id, resgatesRepository);
        return new ResgateDto(resgates.get());
    }

    public ResponseEntity<?> deleteResgate(Long id){
        resgatesRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
