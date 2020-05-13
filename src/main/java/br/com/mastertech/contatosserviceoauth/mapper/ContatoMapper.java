package br.com.mastertech.contatosserviceoauth.mapper;

import br.com.mastertech.contatosserviceoauth.dto.ContatoDTO;
import br.com.mastertech.contatosserviceoauth.model.Contato;
import org.springframework.stereotype.Component;

@Component
public class ContatoMapper {

    public Contato convertFromDtoToEntity(ContatoDTO dto){
        Contato entity = new Contato();

        entity.setNome(dto.getNome());
        entity.setTelefone(dto.getNome());

        return entity;
    }

    public ContatoDTO convertFromEntityToDto(Contato entity){
        ContatoDTO dto = new ContatoDTO();

        dto.setNome(entity.getNome());
        dto.setTelefone(entity.getTelefone());

        return dto;
    }
}
