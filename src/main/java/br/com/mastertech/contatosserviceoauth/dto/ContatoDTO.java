package br.com.mastertech.contatosserviceoauth.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ContatoDTO {

    private Long id;

    @NotNull(message = "Nome do contato não pode ser nulo")
    @NotBlank(message = "Favor	 informar o nome do contato")
    private String nome;

    @NotNull(message = "Telefone do contato não pode ser nulo")
    @NotBlank (message = "Favor	 informar o telefone do contato")
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
