package br.com.coletafacil.ColetaFacilApi.model;

import br.com.coletafacil.ColetaFacilApi.repository.ColetorRepository;
import lombok.Data;

import javax.persistence.*;
import java.util.Optional;
@Entity
@Data
public class Coletor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "url_foto")
    private String urlFoto;

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
