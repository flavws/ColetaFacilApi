package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.dto.ResgateDto;
import br.com.coletafacil.ColetaFacilApi.model.Resgate;
import br.com.coletafacil.ColetaFacilApi.repository.ResgateRepository;
import br.com.coletafacil.ColetaFacilApi.service.ResgateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resgate")
public class ResgateController {
    @Autowired
    ResgateService resgatesService;

    @Autowired
    ResgateRepository resgatesRepository;

    @PostMapping
    public Resgate createResgate(@RequestBody Resgate resgates){
        return resgatesService.createResgate(resgates);
    }

    @GetMapping
    public List<ResgateDto> getResgates(){
        return resgatesService.getResgates();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResgateDto> updateResgate(@PathVariable Long id, @RequestBody ResgateDto resgatesDTO){
        return ResponseEntity.ok(resgatesService.updateResgate(id, resgatesDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteResgate(@PathVariable Long id){
        return ResponseEntity.ok(resgatesService.deleteResgate(id));
    }
}

