package br.com.coletafacil.ColetaFacilApi.controller;

import br.com.coletafacil.ColetaFacilApi.model.Ecoponto;
import br.com.coletafacil.ColetaFacilApi.repository.EcopontoRepository;
import br.com.coletafacil.ColetaFacilApi.service.EcopontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecoponto")
public class EcopontoController {

    @Autowired
    private EcopontoRepository ecopontoRepository;

    @Autowired
    private EcopontoService ecopontoService;

    @PostMapping
    public ResponseEntity createEcoponto (@RequestBody Ecoponto ecoponto){
        ecopontoService.createEcoponto(ecoponto);
        return ResponseEntity.ok().build();
        }

    @GetMapping
    public List<Ecoponto> getEcoponto(){
        return ecopontoService.getEcoponto();
    }

}
