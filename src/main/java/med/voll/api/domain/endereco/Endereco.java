package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String uf;
    private String numero;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.cidade = dadosEndereco.cidade();
        this.complemento = dadosEndereco.complemento();
        this.uf = dadosEndereco.uf();
        this.numero = dadosEndereco.numero();
    }

    public void AtualizarInformacoes(DadosEndereco endereco) {
        if(endereco.logradouro() != null) this.logradouro = endereco.logradouro();
        if(endereco.bairro() != null) this.bairro = endereco.bairro();
        if(endereco.cep() != null) this.cep = endereco.cep();
        if(endereco.cidade() != null) this.cidade = endereco.cidade();
        if(endereco.complemento() != null) this.complemento = endereco.complemento();
        if(endereco.uf() != null) this.uf = endereco.uf();
        if(endereco.numero() != null) this.numero = endereco.numero();
    }
}
