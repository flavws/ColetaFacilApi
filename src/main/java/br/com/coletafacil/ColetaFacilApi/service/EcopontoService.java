package br.com.coletafacil.ColetaFacilApi.service;

import br.com.coletafacil.ColetaFacilApi.model.Ecoponto;
import br.com.coletafacil.ColetaFacilApi.repository.EcopontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcopontoService {

    @Autowired
    private EcopontoRepository ecopontoRepository;

    public Ecoponto createEcoponto(Ecoponto ecoponto) {
        return ecopontoRepository.save(ecoponto);
    }

    public List<Ecoponto> getEcoponto() {
        return ecopontoRepository.findAll();
    }
}
