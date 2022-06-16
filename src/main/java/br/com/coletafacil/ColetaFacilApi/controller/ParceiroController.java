package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.dto.ParceiroDto;
import br.com.coletafacil.ColetaFacilApi.model.Parceiro;
import br.com.coletafacil.ColetaFacilApi.repository.ParceiroRepository;
import br.com.coletafacil.ColetaFacilApi.service.ParceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parceiro")
public class ParceiroController {

    @Autowired
    ParceiroRepository parceiroRepository;

    @Autowired
    ParceiroService parceiroService;

    @PostMapping
    public Parceiro createParceiro(@RequestBody Parceiro parceiros){
        return parceiroService.createParceiro(parceiros);
    }

    @GetMapping
    public List<ParceiroDto> getParceiros(){
        return parceiroService.getParceiro();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParceiroDto> updateParceiro(@PathVariable Long id, @RequestBody ParceiroDto parceirosDTO){
        return ResponseEntity.ok(parceiroService.updateParceiro(id, parceirosDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteParceiro (@PathVariable Long id){
        return ResponseEntity.ok(parceiroService.deleteParceiro(id));
    }
}
