package br.com.mastertech.contatosserviceoauth.service;


import br.com.mastertech.contatosserviceoauth.model.Contato;
import br.com.mastertech.contatosserviceoauth.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    //metodos que serao utilizados no controller
    public Contato criar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Contato obterContatoPorId(Long id) {
        Optional<Contato> contatoOptional = contatoRepository.findById(id);

            return contatoOptional.get();
    }

    public List<Contato> obterTodosOsContatos(){
        return contatoRepository.findAll();
    }


}
