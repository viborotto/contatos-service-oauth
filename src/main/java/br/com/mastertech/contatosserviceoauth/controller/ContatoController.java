package br.com.mastertech.contatosserviceoauth.controller;

import br.com.mastertech.contatosserviceoauth.dto.ContatoDTO;
import br.com.mastertech.contatosserviceoauth.mapper.ContatoMapper;
import br.com.mastertech.contatosserviceoauth.model.Contato;
import br.com.mastertech.contatosserviceoauth.principal.Usuario;
import br.com.mastertech.contatosserviceoauth.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ContatoController {

    //@AutenticationPrincipal Usuario usuario

    @Autowired
    private ContatoService contatoService;

    @Autowired
    private ContatoMapper contatoMapper;

    @GetMapping("/contatos")
    public ResponseEntity<List<ContatoDTO>> obterTodosOsContatos(@AuthenticationPrincipal Usuario usuario){
        List<Contato> entity = contatoService.obterUsuarioPorId((long) usuario.getId());

        return ResponseEntity.ok(contatoMapper.convertFromEntityListToDtoList(entity));
    }


    @PostMapping("/contato")
    public ResponseEntity<ContatoDTO> criarContato(@AuthenticationPrincipal Usuario usuario, @Valid @RequestBody ContatoDTO dto){
        Contato entity = contatoMapper.convertFromDtoToEntity(dto);

        entity = contatoService.criar(entity);

        return ResponseEntity.status(HttpStatus.CREATED).body(contatoMapper.convertFromEntityToDto(entity));
    }
}
