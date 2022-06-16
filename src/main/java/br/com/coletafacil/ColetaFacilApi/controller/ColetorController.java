package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.dto.ColetorDto;
import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import br.com.coletafacil.ColetaFacilApi.service.ColetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/coletor")
public class ColetorController {
    @Autowired
    ColetorRepository coletorRepository;
    @Autowired
    ColetorService coletorService;

    @PostMapping
    public Coletor createColetor (@RequestBody Coletor coletor){
        return coletorService.createColetor(coletor);
    }

    @GetMapping
    public List<Coletor> getColetor(){
        return  coletorService.getColetor();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ColetorDto> updateColetor(@PathVariable Long id, @RequestBody ColetorDto coletorDTO){
        return ResponseEntity.ok(coletorService.updateColetor(id, coletorDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteColetor(@PathVariable Long id){
        return ResponseEntity.ok(coletorService.deleteColetor(id));
    }
}
