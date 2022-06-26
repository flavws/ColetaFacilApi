package br.com.coletafacil.ColetaFacilApi.dto;

import br.com.coletafacil.ColetaFacilApi.model.Coletor;
import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColetorDto {
    private Long idColetor;

    private String cpf;

    private String nome;

    private String cidade;

    private String veiculo;

    private String endereco;

    private Integer nivel;

    private String contato;

    private String emailColetor;

    private String senhaColetor;

    private String urlFoto;

    public ColetorDto(Coletor coletor) {
        this.idColetor = coletor.getIdColetor();
        this.cpf = coletor.getCpf();
        this.nome = coletor.getNome();
        this.cidade = coletor.getCidade();
        this.veiculo = coletor.getVeiculo();
        this.endereco = coletor.getEndereco();
        this.nivel = coletor.getNivel();
        this.contato = coletor.getContato();
        this.senhaColetor = coletor.getSenhaColetor();
        this.emailColetor = coletor.getEmailColetor();
        this.urlFoto = coletor.getUrlFoto();

    }

    public Optional<Coletor> atualizar(Long id, ColetorRepository coletorRepository){

        Optional<Coletor> coletorEntity = coletorRepository.findById(id);

        coletorEntity.get().setIdColetor(this.idColetor);
        coletorEntity.get().setCidade(this.cidade);
        coletorEntity.get().setContato(this.contato);
        coletorEntity.get().setCpf(this.cpf);
        coletorEntity.get().setNome(this.nome);
        coletorEntity.get().setNivel(this.nivel);
        coletorEntity.get().setVeiculo(this.veiculo);
        coletorEntity.get().setEndereco(this.endereco);
        coletorEntity.get().setEmailColetor(this.emailColetor);
        coletorEntity.get().setSenhaColetor(this.senhaColetor);
        coletorEntity.get().setUrlFoto(this.urlFoto);

        coletorRepository.save(coletorEntity.get());

        return coletorEntity;
    }
}
